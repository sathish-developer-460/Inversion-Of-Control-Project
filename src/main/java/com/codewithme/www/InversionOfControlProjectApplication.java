package com.codewithme.www;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InversionOfControlProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(InversionOfControlProjectApplication.class, args);
//		System.out.println("Hello World");
//		Mobiles obj = new OnePlus();
//		obj.getModelAndColor();
		//Spring bean container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobilesConfig.class);
		
		Mobiles obj = context.getBean("getOnePlusObject", Mobiles.class); //new OnePlus();
		obj.getModelAndColor();
		
		Mobiles obj1 = context.getBean("getIPhoneObject", Mobiles.class); //new IPhone();
		obj1.getModelAndColor();
		
	}

}
