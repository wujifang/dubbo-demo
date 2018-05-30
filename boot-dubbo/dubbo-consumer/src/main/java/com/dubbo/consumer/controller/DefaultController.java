package com.dubbo.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.DubboService;

@RestController
@RequestMapping("/user")
public class DefaultController {

	@Reference(version = "1.0.0", application = "${dubbo.application.id}")
	private DubboService dubboService;

	@RequestMapping("/sayHello")
	public String register(String name) {
		return dubboService.sayHello(name);
	}
}
