package com.huangguang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//激活eureka中的DiscoveryClient实现 启用服务注册与发现
public class SpringClientAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClientAApplication.class, args);
	}
}
