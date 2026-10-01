package com.codewithme.www;

public class OnePlus implements Mobiles {
	//initialing the variable 
	Color color; //new Color();
	
//	//Constructor
//	OnePlus(){
//		System.out.println("OnePlus Constructor triggered");
//	}
	
	//Constructor
		OnePlus(Color colorObj){
			this.color = colorObj;
			System.out.println("OnePlus Constructor triggered");
		}
	@Override
	public void getModelAndColor() {
		// TODO Auto-generated method stub
		System.out.println("Model: 9 Pro");
		color.getOnePlusColor();
	}

}
