package com.kevin.serviceImpl;

import com.kevin.service.HelloApi;

public class HelloApiDecorator {

	private HelloApi helloApi;

	public HelloApiDecorator() {

	}

	public HelloApiDecorator(HelloApi helloApi) {
		this.helloApi = helloApi;
	}
	
	public void sayDecorator()
	{
		helloApi.say();
	}
}
