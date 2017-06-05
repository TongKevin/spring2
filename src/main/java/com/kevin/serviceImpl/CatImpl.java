package com.kevin.serviceImpl;

import org.springframework.stereotype.Service;

import com.kevin.service.Cat;

@Service
public class CatImpl implements Cat {

	public void eat(String food) {
		System.out.println("cat eat "+food);
	}
}
