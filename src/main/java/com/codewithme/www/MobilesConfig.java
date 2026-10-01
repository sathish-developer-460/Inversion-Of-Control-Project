package com.codewithme.www;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobilesConfig {
	@Bean
	public Color getColor() {
		return new Color(); //return an Object
	}
	//Creating a Bean class
	@Bean
	//passing the reference variable
	public Mobiles getOnePlusObject(Color getColor) {
		//return an OnePlus Object 
		return new OnePlus(getColor);
	}
	@Bean 
	public Mobiles getIPhoneObject(Color getColor) {
		//return an IPhone Object
		return new IPhone(getColor);
	}
}
