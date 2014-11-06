package com.xqar.dubbo01.service;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello() {
		System.out.println("hello zy!");
		return "Hello";
		

	}

}
