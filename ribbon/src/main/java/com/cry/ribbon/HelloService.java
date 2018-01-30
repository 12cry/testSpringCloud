package com.cry.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	public String hiService(String name) {
		return restTemplate.getForObject("http://127.0.0.1:8180/t1?name=4",String.class);
//		return restTemplate.getForObject("http://service1/t1?name="+name,String.class);
	}

}