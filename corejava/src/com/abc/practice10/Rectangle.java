package com.abc.practice10;

public class Rectangle extends Shape//cannot create object of shape(parent class)
{//so use child class
    private float width;
    private float height;
    
    public Rectangle()//constructor instead of getter n setter
    {
    	this.width=2.0f;
    	this.height=5.0f;
    }
	

	@Override
	void calArea() {
		area=width*height;
		
		
	}
	

}
