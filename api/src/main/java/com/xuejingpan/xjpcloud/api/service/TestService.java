package com.xuejingpan.xjpcloud.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @InterfaceName TestService
 * @Description TODO
 * @Author xuejingpan
 */
@FeignClient(value = "xjp-cloud-auth")
public interface TestService {

    @GetMapping("test")
    String test();
}
