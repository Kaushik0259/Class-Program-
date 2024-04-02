package com.demo;
// Same name method and same parameter list also but appearing in different derived classes
 class ABC
 {
	 public void add(int a, int b)// Method Overriding
	 {
		 System.out.println("form ABC class");
	 }

 }
 
 class PQR extends ABC
 {
	 public void add(int a, int b)
	 {
		 System.out.println("PQR class"+a+b);
	 }
 }

public class Calculator2 {

	public static void main(String[] args) {
		
		ABC p=new PQR();//up-casting
		p.add(2, 3);
		p.add(8, 7);
	}

}
