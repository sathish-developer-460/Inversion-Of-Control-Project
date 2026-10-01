package com.codewithme.www;

public class IPhone implements Mobiles {
	
	Color color; // new Color();
	
	IPhone(Color colorObj) {
		this.color = colorObj;
	}
	@Override
	public void getModelAndColor() {
		// TODO Auto-generated method stub
		System.out.println("Model : 13 Pro");
		color.getIPhoneColor();
	}

}
