package com.abc.practice;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// implicit Type casting(widening)
		byte b=10;
		int i=b;
		System.out.println(i);
		
		//explicit Type casting(narrowing)
		float f2=35.42f;
		int f1=(int)f2;
		System.out.println(f1);
		
		
		
		
		short a=20;//implicit
		float f=a;
		System.out.println(f);
		
		double d=12.444444444444;//explicit
		long e=(long)d;
		System.out.println(e);
		
	}

}
