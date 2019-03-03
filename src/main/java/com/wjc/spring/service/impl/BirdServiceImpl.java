package com.wjc.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.wjc.spring.bean.Bird;
import com.wjc.spring.service.BirdService;

@Service
@Scope("prototype")
public class BirdServiceImpl implements BirdService {

	@Autowired
	@Qualifier("Quail")
	private Bird bird;

	public void ScopTest() {
		bird.twitter();
		bird.changeTwiter();
		bird.twitter();
	}

	@Override
	public Bird getBird() {
		// TODO Auto-generated method stub
		return bird;
	}
	public void playBird() {
		int choice = (int) Math.floor(Math.random() * 4);

		if (choice == 0) {
			bird.fly();
		} else if (choice == 1) {
			bird.feed();
		} else {
			bird.twitter();
		}

	}
	
}
