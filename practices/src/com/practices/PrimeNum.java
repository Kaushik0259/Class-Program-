package com.practices;

public class PrimeNum {

	public static void main(String[] args) 
	{
		System.out.println("Prime numbers between 1 and 1000:");
        
        for (int i = 1; i <= 1000; i++) 
        {
            
            if (isPrime(i)) 
            {
                System.out.print(i + " ");
            }
        }
	}
	
    public static boolean isPrime(int num) 
    {
        if (num <= 1) 
        {
            return false; 
        }
        // Check divisibility from 2 to the square root of num
        for (int i = 2; i * i <= num; i++) 
        {
            if (num % i == 0) 
            {
                return false; 
            }
        }
        return true; // If num is not divisible by any number, it's prime
    }
}
