package com.wjc.spring.bean.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.wjc.spring.bean.Bird;

//这是鹌鹑
//这个使用原型模式
@Component
@Qualifier("Quail")
@Scope("prototype")
public class Quail implements Bird {

	private String flyStr ="鹌鹑起飞"; 
	private String feedStr = "鹌鹑想吃啥就吃啥";
	private String twiterStr = "鹌鹑不知道怎么叫";
	
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

	public void changeTwiter() {
		twiterStr = "我大鹌鹑今天就是饿死。。。。";
	}
	
}
