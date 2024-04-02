package com.demo;

public class Calculator {
	
	int a;
	float b, result;
	
	public void add(int a, float b)
	{
		result=a+b;
		System.out.println(result);
	}
	
	public void add(int a, float b,int c)
	{
		result=a+b+c;
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		Calculator cal= new Calculator();
		cal.add(2, 9.5f);
		cal.add(2, 10.5f);

	}

}
