package com.atguigu.eureka;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-hello")
public interface HelloService {

	@GetMapping("/sayHello")
	public String sayHello(@RequestParam("name")String name);
}
