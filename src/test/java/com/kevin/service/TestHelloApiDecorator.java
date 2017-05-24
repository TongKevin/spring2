package com.kevin.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kevin.serviceImpl.HelloApiDecorator;

public class TestHelloApiDecorator {

	static ClassPathXmlApplicationContext context;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.destroy();
	}

	@Test
	public void testSay() {

		HelloApiDecorator d1 = context.getBean("decorator1", HelloApiDecorator.class);
		d1.sayDecorator();
	}

}
