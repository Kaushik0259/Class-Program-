package com.javacore.demo;

public class ForEachDemo {

	public static void main(String[] args) {
		
		int[] marks = {12,4,5};
		System.out.println("Using For-Each Loop");
		for(int a : marks) //a=0; a<marks; i++
		{
			System.out.println(a);
		}

	}

}
