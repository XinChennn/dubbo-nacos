package cn.ixinjiu.provider.service.impl;

import cn.ixinjiu.api.service.UserService;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by XinChen on 2022-09-09
 *
 * @Description: TODO
 */
@DubboService
public class UserServiceImpl implements UserService {
//    @Value(value = "${demo.name}")
//    @NacosValue(value = "${demo.name}", autoRefreshed = true)
    @Value(value = "${demo.name}")
    private String text;
    @Override
    public String getUser() {
        return text;
    }
}
