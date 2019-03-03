package com.wjc.spring.bean.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.wjc.spring.bean.Bird;
//这是鹦鹉
@Component
@Qualifier("parrot")
public class Parrot implements Bird {

	private String flyStr ="鹦鹉起飞"; 
	private String feedStr = "啥都吃";
	private String twiterStr = "说人话";
	
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
		twiterStr = "你好你好";
	}

}
