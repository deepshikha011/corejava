package com.abc.practice3;

public class EncapsulationDemo {

	public static void main(String[] args) //driver class 
	{
		//create object to refer classes and access
 		EncapsulationExample obj=new EncapsulationExample();//new memory will be allocated for obj for whatever is there in class
 		obj.setAge(20);
 		obj.setName("Deepshikha");
 		obj.setSerialNum(100);
 		
 		obj.getAge();
 		obj.getName();
 		obj.getSerialNum();
 		
 		System.out.println(obj);

	}

}
