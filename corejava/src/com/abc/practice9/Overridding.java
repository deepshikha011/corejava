package com.abc.practice9;

public class Overridding {

	public static void main(String[] args) {
		//polymorphism has 2 types method overloading n overridding
		RBI rbi;//creating instance of super class
		
		//HDFC obj=new HDFC();
		//SBI obj1=new SBI();
		
		rbi=new SBI();
		System.out.println(rbi.getRateOfInterest());
		rbi=new HDFC();
		System.out.println(rbi.getRateOfInterest());
		rbi=new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
		}

}
