package com.wjc.spring.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wjc.spring.bean.Bird;
import com.wjc.spring.config.BeanConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BeanConfig.class)
public class BeanTest {

	@Autowired
	private Bird bird;
	
	//测试1，查看是否自动装配了知更鸟
	//此时bean.impl只有robin
	@Test
	public void BeanTest1() {
		assertNotNull(bird);
	}
	
	
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
