package cn.ixinjiu.provider;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by XinChen on 2022-09-09
 *
 * @Description: TODO
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDubbo(scanBasePackages = "cn.ixinjiu.provider.service")
@EnableDiscoveryClient
//@NacosPropertySource(dataId = "cn.ixinjiu.api.service.UserService", autoRefreshed = true)
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
