package com.javacore.demo;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Choose Your Coffee");
		System.out.println("1.Espresso");
		System.out.println("2.Cappuccino");
		System.out.println("3.Latte");
		System.out.println("4.Mocha");
		
		int choice= sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("You chosse the Espresso, price is 350");
				break;
		}
		
	}

}
