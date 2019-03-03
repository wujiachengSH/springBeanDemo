package com.wjc.spring.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wjc.spring.bean.Bird;
import com.wjc.spring.config.BeanConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfig.class)
public class BeanTest2 {

	@Autowired
	private Bird bird;

	

	
	// 此时项目中Bird有2个实现类
	// 由于没有声明装配了哪个Bean，会报错
	@Test
	public void BeanTest1() {
		assertNotNull(bird);
	}

	// 通过给鹦鹉添加@Primary解决自动装配问题
	@Test
	public void BeanTest2() {
		// 此时鹦鹉添加了@Primary
		bird.fly();
		assertNotNull(bird);
	}

	
	@Autowired
	@Qualifier("parrot")
	private Bird parrot;
	
	
	//使用@Primary注解注定会导致Robin.java无法装配，为了解决此问题，添加@Qualifier("parrot")来解决声明问题会更加合适
	@Test
	public void BeanTest3() {
		// 此时鹦鹉添加了@Primary
		parrot.fly();
		assertNotNull(parrot);
	}

	

}
