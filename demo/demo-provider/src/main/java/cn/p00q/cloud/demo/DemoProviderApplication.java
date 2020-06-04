package cn.p00q.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: AlibabaCloud
 * @description: demo提供应用
 * @author: DanBai
 * @create: 2020-06-02 20:35
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class DemoProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoProviderApplication.class, args);
    }
}