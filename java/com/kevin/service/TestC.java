package com.kevin.service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kevin.serviceImpl.CA;

import junit.framework.Assert;

public class TestC {

	static ClassPathXmlApplicationContext context;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
		//context.setAllowCircularReferences(false);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.destroy();
	}

	@Test
	public void testSay() {

		CA ca = context.getBean("ca", CA.class);
		
	}

	

}
