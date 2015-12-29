package com.kongwu.insweb.filter;

import cn.drive.web.service.system.AuthorityService;
import cn.drive.web.utils.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * ClassName: SysUserFilter <br/>
 * Description: 用户拦截器. <br/>
 * date: 2014年5月13日 上午8:53:49 <br/>
 *
 * @author zyyang3
 * @version 1.0
 * @since JDK 1.6
 */
public class SysUserFilter extends PathMatchingFilter {

    @Autowired
    private AuthorityService authorityService;

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response,
                                  Object mappedValue) throws Exception {

        String username = (String) SecurityUtils.getSubject().getPrincipal();
        request.setAttribute(Constants.CURRENT_USER, authorityService.findUserByUsername(username));
        request.setAttribute(Constants.CURRENT_Product, authorityService.findProductDes());
        return true;
    }
}
