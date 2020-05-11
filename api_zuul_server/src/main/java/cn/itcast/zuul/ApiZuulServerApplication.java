package cn.itcast.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//开启zuul的网关功能
@EnableZuulProxy
//开启服务发现功能
@EnableDiscoveryClient
public class ApiZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiZuulServerApplication.class, args);
    }

}
