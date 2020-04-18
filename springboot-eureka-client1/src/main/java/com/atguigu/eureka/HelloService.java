package com.atguigu.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	@Value("${server.port}")
	String port;
	public String sayHello(String name) {
		return "Hello "+ name+",this port is "+port;
	}

}
