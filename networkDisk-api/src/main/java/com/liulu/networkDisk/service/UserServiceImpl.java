package com.liulu.networkDisk.service;

import com.liulu.networkDisk.mapper.UserMapper;
import com.liulu.networkDisk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    public User selectuUserById(Integer id) {
        int i=1/0;
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    public Boolean  insertUser(User user){
        if(user.getName()!=null){
            user.setPwd("111");
            user.setTime(new Date());
             userMapper.insert(user);
             return true;
        }
       return false;
    }
}
