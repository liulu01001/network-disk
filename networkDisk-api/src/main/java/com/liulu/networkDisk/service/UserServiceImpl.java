package com.liulu.networkDisk.service;

import com.liulu.networkDisk.mapper.UserMapper;
import com.liulu.networkDisk.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class UserServiceImpl {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    public User selectuUserById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Transactional
    public Boolean insertUser(User user) {
        if (user.getName() != null) {
            user.setPwd("111");
            user.setTime(new Date());
            userMapper.insert(user);
            return true;
        } else {
            logger.error("ccc");
        }
        return false;
    }
}
