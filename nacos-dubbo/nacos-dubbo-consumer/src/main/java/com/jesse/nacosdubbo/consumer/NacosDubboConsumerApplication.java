package com.jesse.nacosdubbo.consumer;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Hello world!
 *
 */
@EnableDubbo
@SpringBootApplication
public class NacosDubboConsumerApplication
{
    public static void main(String[] args) {
        SpringApplication.run(NacosDubboConsumerApplication.class, args);
    }
}

