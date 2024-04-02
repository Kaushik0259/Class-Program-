package com.javacore.demo;

public class ArrayInJava1 {
	
	static void methodOne(double d[])
	{
		d[2]=25.35;
		d[5]=45.35;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]d= new double[8];
		d[2]=10.25;//changing the value of element at index 2
		d[5]=15.25;
		
		methodOne(d);//passing array to methodOne()
		System.out.println(d[2]);
		System.out.println(d[5]);
	}

}
