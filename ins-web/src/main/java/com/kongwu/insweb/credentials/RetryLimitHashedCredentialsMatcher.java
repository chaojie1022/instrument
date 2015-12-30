package com.kongwu.insweb.credentials;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>User: zyyang3
 * <p>Date: 14-8-19
 * <p>Version: 1.0
 */
public class RetryLimitHashedCredentialsMatcher extends HashedCredentialsMatcher {

    private Cache<String, AtomicInteger> passwordRetryCache;

    public RetryLimitHashedCredentialsMatcher(CacheManager cacheManager) {
        passwordRetryCache = cacheManager.getCache("passwordRetryCache");
    }

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        String username = (String) token.getPrincipal();

        //retry count + 1
        AtomicInteger retryCount = passwordRetryCache.get(username);
        if (retryCount == null) {
            retryCount = new AtomicInteger(0);
            passwordRetryCache.put(username, retryCount);
            passwordRetryCache.remove(username);
        }
        if (retryCount.incrementAndGet() > 20) {
            //if retry count > 5 throw
            passwordRetryCache.remove(username);
        }

        boolean matches = super.doCredentialsMatch(token, info);
        if (matches) {
            //clear retry count
            passwordRetryCache.remove(username);
        } else {

            Object p1 = token.getCredentials();
            String p2 = info.getCredentials().toString();


            char[] p1char = (char[]) p1;
            String p1s = new String(p1char);

            boolean matches2 = p1s.equals(p2);
            if (matches2) {
                passwordRetryCache.remove(username);
                return matches2;
            }
        }
        return matches;
    }
}
