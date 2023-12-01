package com.xuejingpan.xjpcloud.auth.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author xuejingpan
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "xjp-cloud-auth";
    }
}
