package com.xqar.dubbo01.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "provider.xml" });
		context.start();
       System.out.println("provider is running...");
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}
}
