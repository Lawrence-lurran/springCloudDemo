package com.lurran.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: order
 * package: com.lurran.controller
 * className: OrderController
 * @author: luran5
 * @date: 2022/7/6 14:22
 * @since V1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/test")
    public String test(){
        return "远程调用order";
    }
}
