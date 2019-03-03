package com.wjc.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wjc.spring.bean.Bird;
import com.wjc.spring.config.BeanConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BeanConfig.class)
public class BeanTest3 {

	@Autowired
	@Qualifier("Quail")
	private Bird bird;
	
	@Autowired
	@Qualifier("Quail")
	private Bird bird2;
	
	//测试原型模式与单例的区别
	@Test
	public void BeanTest1() {
		bird.twitter();
		bird.changeTwiter();
		bird.twitter();
		
		bird2.twitter();
		bird2.changeTwiter();
		bird2.twitter();
	}
	
	@Autowired
	@Qualifier("parrot")
	private Bird parrot;
	
	@Autowired
	@Qualifier("parrot")
	private Bird parrot2;
	
	//测试原型模式与单例的区别
	@Test
	public void BeanTest2() {
		parrot.twitter();
		parrot.changeTwiter();
		parrot.twitter();
		
		parrot2.twitter();
		parrot2.changeTwiter();
		parrot2.twitter();
	}
	

	
	
	


}
