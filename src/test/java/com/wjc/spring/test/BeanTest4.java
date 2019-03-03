package com.wjc.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wjc.spring.bean.impl.Cuckoo;
import com.wjc.spring.config.BeanConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BeanConfig.class)
public class BeanTest4 {


	
	@Autowired
	@Qualifier("Cuckoo2")
	private Cuckoo Cuckoo;
	
	@Autowired
	@Qualifier("Cu`ckoo1")
	private Cuckoo Cuckoo1;
	//测试通过配置文件装配Bean
	@Test
	public void BeanTest1() {
		Cuckoo1.fly();
		Cuckoo1.feed();
		Cuckoo1.twitter();
		Cuckoo.fly();
		Cuckoo.feed();
		Cuckoo.twitter();
	}
	

	

	
	
	


}
