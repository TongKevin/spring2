package com.kevin.serviceImpl;

import java.beans.ConstructorProperties;
import java.util.List;

import com.kevin.service.HelloApi;

public class HelloApiImpl implements HelloApi {

	private String message;

	private int index;

	private String URL;

	private boolean success;

	private List<String> valueList;

	public HelloApiImpl() {
		this.message = "Kevin";
		this.index = 8;
	}

	@ConstructorProperties({ "msg", "idx" })
	public HelloApiImpl(String message, int index) {
		this.message = message;
		this.index = index;
	}

	@Override
	public void say() {

		System.out.println("Hello " + this.message + this.index);
	}

	@Override
	public void say2() {

		System.out.println("Hello " + this.message + this.index + "--" + this.URL + "---" + this.success);
	}

	@Override
	public void say3() {

		for (int i = 0; i < valueList.size(); i++) {
			System.out.println(valueList.get(i));
		}
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setValueList(List<String> valueList) {
		this.valueList = valueList;
	}

}
