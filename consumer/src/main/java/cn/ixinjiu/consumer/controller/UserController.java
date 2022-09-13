package cn.ixinjiu.consumer.controller;

import cn.ixinjiu.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XinChen on 2022-09-09
 *
 * @Description: TODO
 */
@RestController
@RefreshScope  // 支持nacos的动态刷新注解
public class UserController {
    @DubboReference
    private UserService userService;

    @GetMapping("test")
    public String test() {
        System.out.println("UserController>>>>>>>>>>>>> ");
        return userService.getUser();
    }


//    @Value("${useLocalCache:false}")
//    private boolean useLocalCache;
//
//    public void setUseLocalCache(boolean useLocalCache) {
//        this.useLocalCache = useLocalCache;
//    }
//
//    @GetMapping(value = "/get")
//    @ResponseBody
//    public boolean get() {
//        return useLocalCache;
//    }

}
