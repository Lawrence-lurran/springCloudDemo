package com.lurran.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: openfegin远程调用order服务
 * package: com.lurran.remote
 * className: RemoteOrder
 * @author: luran5
 * @date: 2022/7/6 15:28
 * @since V1.0
 */
@FeignClient(value = "order",path = "order")
public interface RemoteOrder {

    @RequestMapping("/test")
    public String test();
}
