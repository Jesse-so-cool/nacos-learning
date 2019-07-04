package com.jesse.nacosdubbo.consumer.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import com.jesse.api.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class NacosDubboController {
    @Reference()
    private DemoService demoService;
    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
       
        System.out.println("name---->"+name);
        return demoService.sayHello(name);
    }
}

