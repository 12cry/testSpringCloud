package com.cry.eurekaclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Service2Controller {

	public static void main(String[] args) {
		SpringApplication.run(Service2Controller.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/t1")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am  port:" + port;
	}

}
