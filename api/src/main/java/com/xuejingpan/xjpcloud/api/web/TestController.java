package com.xuejingpan.xjpcloud.api.web;

import com.xuejingpan.xjpcloud.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author xuejingpan
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test")
    public String test() {
        return "xjp-cloud-api-" + testService.test();
    }
}
