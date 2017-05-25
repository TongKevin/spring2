package com.kevin.serviceImpl;

import com.kevin.service.HelloApi;

public class HelloApiDecorator {

	private HelloApi helloApi;

	private HelloApi helloApi2;
	
	public void setHelloApi2(HelloApi helloApi2) {
		this.helloApi2 = helloApi2;
	}

	public HelloApiDecorator() {

	}

	public HelloApiDecorator(HelloApi helloApi) {
		this.helloApi = helloApi;
	}

	public void sayDecorator() {
		helloApi.say();
	}

	public void setHelloApi(HelloApi helloApi) {
		this.helloApi = helloApi;
	}
}
