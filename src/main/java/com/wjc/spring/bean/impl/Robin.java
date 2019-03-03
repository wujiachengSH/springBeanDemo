package com.wjc.spring.bean.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.wjc.spring.bean.Bird;
//这是知更鸟
@Component
@Qualifier("Robin")
public class Robin implements Bird {

	private String flyStr ="知更鸟起飞"; 
	private String feedStr = "不想吃东西";
	private String twiterStr = "啊啊啊";
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(flyStr);
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println(feedStr);
	}

	@Override
	public void twitter() {
		// TODO Auto-generated method stub
		System.out.println(twiterStr);
	}

	@Override
	public void changeTwiter() {
		// TODO Auto-generated method stub
		
	}

}
