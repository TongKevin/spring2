package com.kevin.serviceImpl;

import org.springframework.stereotype.Service;

import com.kevin.service.Dog;

@Service
public class DogImpl implements Dog {

	@Override
	public void eat(String food) {
		System.out.println("dog eat "+food);

	}

}
