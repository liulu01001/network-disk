package com.liulu.networkDisk.controller;

import com.liulu.networkDisk.model.UserInfoModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class SampleController {

    @RequestMapping("/hello")
    public UserInfoModel home() {
        UserInfoModel userInfoModel = new UserInfoModel();
        userInfoModel.setName("小明");
        return userInfoModel;
    }
}
