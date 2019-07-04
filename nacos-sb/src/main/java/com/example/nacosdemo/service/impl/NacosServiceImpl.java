package com.example.nacosdemo.service.impl;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.naming.NamingService;
import com.example.nacosdemo.service.NacosService;


public class NacosServiceImpl implements NacosService {
    @Override
    public String say() {

       return "hello world";

    }
}
