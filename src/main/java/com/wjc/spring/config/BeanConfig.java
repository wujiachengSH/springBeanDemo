package com.wjc.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.wjc.spring.bean.impl.Cuckoo;


@Configuration
//扫描指定包目录
@ComponentScan(basePackages="com.wjc")
@PropertySource("classpath:Cuckoo.properties")
public class BeanConfig {
	//开启组件扫描
	//获取资源
	@Autowired
	private Environment env;
	
	//通过配置文件装配Cuckoo
	@Bean(name="Cuckoo1")
	public Cuckoo getbird() {
		
		  return new Cuckoo(env.getProperty("flyStr","fly"),
		  env.getProperty("feedStr","feed"), env.getProperty("twiterStr","twiter"));
		 
		//return new Cuckoo("fly","feed", "twiter");
		
	}
	@Bean(name="Cuckoo2")
	public Cuckoo getbird2() {
		 
		return new Cuckoo("fly","feed", "twiter");
		
	}
	
}
