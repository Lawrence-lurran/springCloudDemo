package com.lurran.controller;

import com.lurran.remote.RemoteOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description: stock
 * package: com.lurran.controller
 * className: StockController
 * @author: luran5
 * @date: 2022/7/6 14:19
 * @since V1.0
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private  RestTemplate restTemplate;

    @Autowired
    private RemoteOrder remoteOrder;

    @RequestMapping("/test")
    public String test(){
        String url="http://order/order/test";
        String forObject = restTemplate.getForObject(url, String.class);
        System.out.println(forObject);
        return "stock远程调用order";
    }
    @RequestMapping("/openFeign")
    public String testOpenFeign(){
        String test = remoteOrder.test();
        System.out.println(test);
        return "stock使用openfeign远程调用order"+test;
    }
}
