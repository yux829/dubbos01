package com.xqar.dubbo01.service;

import org.nutz.json.Json;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xqar.nutz01.PersonServices;
import com.xqar.nutz01.domain.Person;

public class NutzTest {
	public static void main(String[] args) {
		/*
		Ioc ioc = new NutIoc(new XmlIocLoader("applicationContext.xml"));
		DataSource ds = ioc.get(DataSource.class);
		*/
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");  
		PersonServices ps = (PersonServices)ac.getBean("personServices");
		Person p = new Person();
		p.setId(2);
		p.setName("ABC2");
		p.setAge(202);
		ps.save2(p);
		System.out.println("ok...............");
//		Person p2 = ps.get(2);
//		System.out.println(Json.toJson(p2));

	}
}
