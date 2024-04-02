package com.javacore.demo;

import java.util.Arrays;

public class ArrayinJava {

	public static void main(String[] args) {
		//Declaring and initializing an array of int
		int[] a= {12,21,0,5,7};
		//Creating a copy of array a using copy of method of java.util
		int[] b= Arrays.copyOf(a, a.length);
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		// now changing value of one array will not reflect in other
		a[2]=56;
		System.out.println(b[2]); //value of 3rd element in array b
		
		b[4]=100;
		System.out.println(a[4]); //value of 5th element in array a
	}

}
