package cn.p00q.cloud.demo.controller;

import cn.p00q.cloud.demo.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: AlibabaCloud
 * @description: Demo
 * @author: DanBai
 * @create: 2020-06-03 10:18
 **/
@RestController
public class DemoController {
    @Reference
    DemoService demoService;

    @GetMapping("/demo")
    public String getDemo(){
        return demoService.echo("danbai");
    }
}
