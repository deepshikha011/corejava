package com.abc.practice3;

public class EncapsulationExample {
private int serialNum;//methods of same class can access it
private String name;
private int age;
//getter and setter
public int getSerialNum() {
	return serialNum;
}
public void setSerialNum(int serialNum) {
	this.serialNum = serialNum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "EncapsulationExample [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
}

}
