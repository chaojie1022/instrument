package com.kongwu.insweb.service;

import com.kongwu.insweb.entity.User;
import com.kongwu.insweb.entity.UserExample;
import com.kongwu.insweb.mapper.UserMapper;
import com.kongwu.insweb.utils.EncryptUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/12/30 0030.
 */
@Service
public class SecurityService {
    @Autowired
    private UserMapper userMapper;

    public User findUser(String username, String password){
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(EncryptUtils.encodeMD5String(password));
        List<User> userList = userMapper.selectByExample(example);
        if(CollectionUtils.isNotEmpty(userList)){
           return userList.get(0);
        }
        return null;
    }

}
