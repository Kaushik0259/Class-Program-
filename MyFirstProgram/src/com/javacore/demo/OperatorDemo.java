package com.javacore.demo;

public class OperatorDemo {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		int result=a+b;
		//Arithmetic operator 
		System.out.println("Arithmetic operator");
		System.out.println("a+b="+result);
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		System.out.println();
		
		//relational operator
		System.out.println("relational operator");
		System.out.println("a>b="+(a-b));
		System.out.println("a<b="+(a<b));
		System.out.println("a<=b="+(a<=b));
		System.out.println("a>=b="+(a>=b));
		System.out.println("a==b="+(a==b));
		System.out.println("a!=b="+(a!=b));
		
		System.out.println();
		
		//bitwise operator
		System.out.println("bitwise operator");
		int m=60;
		int n=13;
		result=m & n;
		System.out.println(result);
		result=m | n;
		System.out.println(result);
		result=a ^ b;
		System.out.println(result);
		result=m<<2; 
		System.out.println(result);
		result=m>>2;
		System.out.println("m>>2"+result);
		
		System.out.println();

		//Ternary operator
		System.out.println("Ternary operator");
		int min=(a<b)? a : b;
		System.out.println(min);
		
		System.out.println();
		
		//assignment operator or complex operator
		System.out.println("assignment operator");
		System.out.println("(a=a+b)="+ (a+=b));
		System.out.println("(a=a-b)="+ (a-=b));	
		System.out.println("(a=a*b)="+ (a*=b));
		System.out.println("(a=a/b)="+ (a/=b));

		System.out.println();
		
		//increment and decrement operator  
		System.out.println("increment and decrement operator");
		int x=5;
		
		System.out.println(x);
		x++;
		System.out.println(x);
//		System.out.println(x);
		System.out.println(x--);
		System.out.println(x);
		
		System.out.println();

		//pre-increment and post-increment 
		System.out.println(++x);//pre-increment
		System.out.println(x++);//post-increment



	}

}
