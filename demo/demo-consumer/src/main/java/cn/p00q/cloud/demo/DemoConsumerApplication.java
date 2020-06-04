package cn.p00q.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: AlibabaCloud
 * @description: demo消费者启动类
 * @author: DanBai
 * @create: 2020-06-03 10:13
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class DemoConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerApplication.class, args);
    }
}
