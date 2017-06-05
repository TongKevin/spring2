package com.kevin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kevin.service.ZooManager;

@Controller

public class ZooController {

	@Autowired
	private ZooManager zooManager;
	
	@RequestMapping(value="/eat", method=RequestMethod.GET)
	public void zet(@PathVariable("id") String food)
	{
		zooManager.eat(food);
	}
}
