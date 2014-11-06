package com.xqar.nutz01;

import org.nutz.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xqar.nutz01.domain.Person;
import com.xqar.nutz01.domain.Person2;

@Component
public class PersonServices {
	@Autowired
	private Dao dao;

	public Person get(int id) {
		return dao.fetch(Person.class, id);
	}

	public void save(Person s) {
		dao.insert(s);
	}
	
	public void save2(Person s){
		dao.insert(s);
		Person2 p2= new Person2();
		p2.setId(s.getId());
		p2.setName(s.getName());
		p2.setAge(s.getAge());
		dao.insert(p2);
		
	}

}
