package com.wjc.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wjc.spring.config.BeanConfig;
import com.wjc.spring.service.BirdService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BeanConfig.class)
public class ServiceTest {

	@Autowired
	private BirdService birdService;
	
	@Autowired
	private BirdService birdService2;
	
	//测试在Service上添加和不添加@Qualifier("Quail")时调用的Bean的区别
	@Test
	public void ServiceTest2() {
		birdService.ScopTest();
		birdService2.ScopTest();
	}
	
	//测试是否可以玩鸟????
	@Test
	public void ServiceTest1() {
		birdService.playBird();
	}
	
	//当Service上有@Scope("prototype")，Bean上有@Scope("prototype")时 返回不同对象
	//当Service上有@Scope("prototype")，Bean上无@Scope("prototype")时 返回相同对象
	//当Service上无@Scope("prototype")，Bean上有@Scope("prototype")时 返回相同对象
	//当Service上无@Scope("prototype")，Bean上无@Scope("prototype")时 返回相同对象
	@Test
	public void ServiceTest3() {
		System.out.println("---------------");
		System.out.println(birdService.getBird());
		System.out.println(birdService2.getBird());
		System.out.println("---------------");
	}
	
}
