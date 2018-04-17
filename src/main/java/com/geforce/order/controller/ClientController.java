package com.geforce.order.controller;

import com.geforce.order.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author geforce
 * @date 2018/4/16
 */
@RestController
@Slf4j
public class ClientController {


//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

//    @Autowired
//    private RestTemplate restTemplate;



    @Autowired
    private ProductClient productClient;



    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        //方式1 直接用restTemplate,url 写死
//        RestTemplate restTemplate = new RestTemplate();
//        String  result = restTemplate.getForObject("http://localhost:8080/msg",String.class);
//        log.info("response:{}",result);


        //方式2  用loadBalancerClient 通过应用名拼接url 然后再使用restTemplate
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s/msg",serviceInstance.getHost(),serviceInstance.getPort());
//        RestTemplate restTemplate = new RestTemplate();
//        String  result = restTemplate.getForObject(url,String.class);
//        log.info("response:{}",result);


        //方式3 用@LoadBalanced,可以在restTemplate直接用应用名
//        String  result = restTemplate.getForObject("http://PRODUCT/msg",String.class);
//        log.info("response:{}",result);

        String result = productClient.productMsg();
        log.info("response:{}",result);
        return result;
    }
}
