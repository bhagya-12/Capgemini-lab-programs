package com.capg.examquestion2.modelandsorting;

import java.util.Comparator;

public class Student {
private String name;
private int age;
private double height;
public Student() {
	super();
	// TODO Auto-generated constructor stub
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
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public Student(String name, int age, double height) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", height=" + height + "]";
}





}
