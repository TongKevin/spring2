package com.kevin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kevin.service.Cat;
import com.kevin.service.Dog;
import com.kevin.service.ZooManager;

@Service("zoo2")
//@Scope("prototype")

public class ZooManagerImpl implements ZooManager {

	@Autowired
	private Cat cat;
	
	@Autowired
	private Dog dog;
	
	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		cat.eat("fish");
		dog.eat("bone");
	}

}
