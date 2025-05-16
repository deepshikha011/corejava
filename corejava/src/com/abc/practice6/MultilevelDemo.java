package com.abc.practice6;

public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City obj=new City();
		obj.setArea(45.6f);//obj will call tostring()
		obj.setCapital("delhi");
		obj.setCityName("bangalore");
		obj.setCountryName("india");
		obj.setLanguage("kannada");
		obj.setStateName("karnataka");
		
		System.out.println(obj);
			
		
		

	}

}
