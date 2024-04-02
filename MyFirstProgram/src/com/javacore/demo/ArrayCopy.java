package com.javacore.demo;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] a= {12,21,0,5,7};
		//Creating a copy of array a using copy of method of java.util
		
		int[] b= Arrays.copyOf(a, a.length);
		
		//creating a copy of array a using arraycopy() method of system
		System.arraycopy(a, 0, b, 0, a.length);
		
		for(int i=0; i<b.length; i++)
			{
				System.out.println(b[i]);
			}

	}

}
