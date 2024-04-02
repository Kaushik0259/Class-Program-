package com.javacore.demo;
//passing array of derived type as A parameter to the method:

class A
{
	int i;
}

public class ArrayInJava2 {
	static void methodOne(A[]a)
	{
		a[2].i=25;
		a[5].i=45;
	}

	public static void main(String[] args) {
		
		A[] a= new A[8];
		a[2] =new A();//creating A-type object and assigning it to element at index2
		a[5]=new A();
		
		a[2].i=10;// changing value of field of A-type object referred by element at index2 
		a[5].i=20;
		
		methodOne(a);//calling method
		
		System.out.println(a[2].i);
		System.out.println(a[5].i);
	}

}
