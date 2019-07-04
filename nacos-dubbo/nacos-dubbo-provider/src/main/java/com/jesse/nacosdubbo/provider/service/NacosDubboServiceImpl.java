package com.jesse.nacosdubbo.provider.service;
import com.alibaba.dubbo.config.annotation.Service;
import com.jesse.api.service.DemoService;

@Service()
public class NacosDubboServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello i am "+name;
    }
}

