package com.kevin.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Assert;

public class TestZoo {

	static ClassPathXmlApplicationContext context;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("classpath:applicationContext4.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.destroy();
	}

	@Test
	public void testSay() {

		ZooManager zm = context.getBean("zoo2", ZooManager.class);
		//zm.eat();
		System.out.println("testSay "+zm.hashCode());
	}

	@Test
	public void testSay2() {

		ZooManager zm = context.getBean("zoo2", ZooManager.class);
		//zm.eat();
		System.out.println("testSay2 "+zm.hashCode());
	}
}
