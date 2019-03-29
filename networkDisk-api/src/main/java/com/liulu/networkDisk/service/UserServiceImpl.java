package com.liulu.networkDisk.service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liulu.networkDisk.mapper.UserMapper;
import com.liulu.networkDisk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate redisTemplate;

    /**
     * 查询所有
     *
     * @return
     */
    public PageInfo<User> findAllUserList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        User user = userMapper.selectByPrimaryKey(9);
        List list = new ArrayList();
        list.add(user);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        // 具体使用
        redisTemplate.opsForList().leftPush("user:list", JSON.toJSONString(list));
        stringRedisTemplate.opsForValue().set("user:name", "张三");
        return pageInfo;
    }
}
