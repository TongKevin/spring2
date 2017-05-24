package com.kevin.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Assert;

public class TestHelloApi {

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

		HelloApi helloApi = context.getBean("h1", HelloApi.class);
		helloApi.say();

		HelloApi helloApi2 = context.getBean("h2", HelloApi.class);
		helloApi2.say();
	}

	@Test
	public void testSay2() {

		HelloApi helloApi = context.getBean("h3", HelloApi.class);
		helloApi.say2();
	}

	@Test
	public void testSay3() {

		HelloApi helloApi = context.getBean("h4", HelloApi.class);
		helloApi.say3();
	}

}
