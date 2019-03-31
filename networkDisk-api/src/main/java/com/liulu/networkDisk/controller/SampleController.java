package com.liulu.networkDisk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class SampleController {

    @RequestMapping("/hello")
    public String home() {
        return "你好";
    }


}
