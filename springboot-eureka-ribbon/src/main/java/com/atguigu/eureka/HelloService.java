package com.atguigu.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;
	public String sayHello(String name) {
		return restTemplate.getForObject("http://SERVICE-HELLO/sayHello?name="+name, String.class);
	}
}
