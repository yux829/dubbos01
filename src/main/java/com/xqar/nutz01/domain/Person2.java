package com.xqar.nutz01.domain;

import org.nutz.dao.entity.annotation.*;

@Table("t_person2")
public class Person2 {
	@Id(auto=false)
	// 表示该字段为一个自增长的Id,注意,是数据库表中自增!!
	private int id;

	@Column
	// 表示该字段可以用来标识此对象，或者是字符型主键，或者是唯一性约束
	private String name;

	@Column
	// 表示该对象属性可以映射到数据库里作为一个字段
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
