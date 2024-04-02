package com.javacore.demo;

import java.util.Scanner;

public class WeekNameByNo {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a no. between 1 to 7 = ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int g=sc.nextInt();

		switch(a)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Thuesday");
			break;
		case 4:
			System.out.println("Wensday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Frieday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}
