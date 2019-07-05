package com.example.nacosdemo;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.alibaba.nacos.spring.context.annotation.EnableNacos;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * zookeeper、eureka、nacos、consul
 */
@RestController
@SpringBootApplication
@NacosPropertySource( dataId = "nacos-sb-prod.properties", autoRefreshed = true)
@EnableNacosConfig(globalProperties = @NacosProperties)
public class NacosDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(NacosDemoApplication.class, args);
    }

    @NacosValue(value = "${str:默认值}", autoRefreshed = true)
    private String str;

    @GetMapping(value = "/get")
    public String get() {
        return str;
    }


}

//    @NacosInjected
//    private NamingService namingService;
//
//    @Value("${server.port}")
//    private int serverPort;
//
//    @Value("${spring.application.name}")
//    private String applicationName;
//
//    @GetMapping(value = "/gettt")
//    public List<Instance> getty(@RequestParam String serviceName) throws NacosException {
//        return namingService.getAllInstances(serviceName);
//    }