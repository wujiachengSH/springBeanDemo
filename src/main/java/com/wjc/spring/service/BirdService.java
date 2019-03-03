package com.wjc.spring.service;

import org.springframework.stereotype.Service;

import com.wjc.spring.bean.Bird;

@Service
public interface BirdService {

	public void playBird() ;

	public void ScopTest();
	
	public Bird getBird();
	
}
