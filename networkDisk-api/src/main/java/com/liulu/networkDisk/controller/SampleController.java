package com.liulu.networkDisk.controller;

import com.github.pagehelper.PageInfo;
import com.liulu.networkDisk.model.User;
import com.liulu.networkDisk.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class SampleController {

    /*@Autowired*/
    UserServiceImpl userServiceImpl;

    @RequestMapping("/hello")
    public String home() {

        return "你好";
    }
    /**
     * 列表查询
     *
     * @return
     */
    @RequestMapping(value = "/user/list")
    public PageInfo<User> findUserList(int pageNum, int pageSize) {
        PageInfo<User> pageInfo = userServiceImpl.findAllUserList(pageNum, pageSize);
        return pageInfo;
    }
}
