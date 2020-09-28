package com.sp.springv1;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{
	
	public void drive() {
		
		System.out.println("drive a bus");
	}

}
