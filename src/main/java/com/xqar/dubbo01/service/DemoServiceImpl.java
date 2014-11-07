package com.xqar.dubbo01.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.xqar.nutz01.PersonServices;
import com.xqar.nutz01.domain.Person;

@Service
public class DemoServiceImpl implements DemoService {
	@Autowired
	private PersonServices ps;
	@Override
	public String sayHello(int id,String name ,int age) {
		Person p = new Person();
		p.setId(id);
		p.setName(name);
		p.setAge(age);
		ps.save2(p);
		System.out.println("hello zy!");
		
		return "Hello";
		

	}

}
