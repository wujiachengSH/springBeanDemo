package com.wjc.spring.bean.impl;

import com.wjc.spring.bean.Bird;
//这是杜鹃
//@Component
//@Qualifier("Cuckoo1")
public class Cuckoo implements Bird {

	private String flyStr = "fly" ; 
	private String feedStr = "feed";
	private String twiterStr = "twiter";
	
	
	public Cuckoo(String flyStr, String feedStr, String twiterStr) {
		super();
		this.flyStr = flyStr;
		this.feedStr = feedStr;
		this.twiterStr = twiterStr;
	}

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
		twiterStr = "杜鹃";
	}

}
