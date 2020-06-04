package cn.p00q.cloud.demo.service.impl;

import cn.p00q.cloud.demo.api.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

/**
 * @program: AlibabaCloud
 * @description: DemoService实现
 * @author: DanBai
 * @create: 2020-06-02 20:39
 **/
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String echo(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                "demo",
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }
}
