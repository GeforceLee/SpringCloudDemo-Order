package com.geforce.order.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author geforce
 * @date 2018/4/16
 */
@FeignClient(name = "product")
public interface ProductClient {
    @GetMapping("/msg")
    String productMsg();
}
