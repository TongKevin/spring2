package com.kevin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kevin.service.ZooManager;

@Controller
@RequestMapping("/zoo")
public class ZooController {

	@Autowired
	private ZooManager zooManager;
	
	@RequestMapping(value="/eat/{id}", method=RequestMethod.GET)
	@ResponseBody
	public String zet(@PathVariable("id") String food)
	{
		System.out.println("food="+food);
		zooManager.eat(food);
		return "{'a':'"+food+"'}";
	}
}
