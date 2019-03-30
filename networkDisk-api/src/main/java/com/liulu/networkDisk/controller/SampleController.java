package com.liulu.networkDisk.controller;

import com.liulu.networkDisk.model.User;
import com.liulu.networkDisk.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class SampleController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/hello")
    public String home() {
        return "你好";
    }

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User selectUserById(Integer id) {
        return userService.selectuUserById(id);
    }
}
