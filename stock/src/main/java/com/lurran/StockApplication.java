package com.lurran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * @description: 启动类
 * package: com.lurran
 * className: OrderApplication
 * @author: luran5
 * @date: 2022/7/5 17:26
 * @since V1.0
 */
@EnableFeignClients
@SpringBootApplication
public class StockApplication {


    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
