package com.demo;

interface Account 
{
	void deposit(double amount);
	void withdraw(double amount);
}
class SavingAccount implements Account
{
	private double balance;
	private double interestRate;
	//constructor
	
	public SavingAccount(double balance, double interestRate) 
	{
		this.balance= balance;
		this.interestRate= interestRate;
	}
	//override method
	
	public void deposit(double amount)
	{
		balance+= amount;
		System.out.println("Deposite"+ amount+"New Balance:"+ balance);
	}
	
	public void withdraw(double amount)
	{
		if(amount<= balance) 
		{
			balance-=amount;
			System.out.println("Withdrawn" + amount+"New balance:"+ balance);
		}
		else
		{
			System.out.println("Insufficient balance:"+ amount);
		}
	}
}

class CurrentAccount
{
	private double balance;
	private double overdraftLimit;
	//constructor
	public CurrentAccount(double balance, double overdraftLimit) 
	{
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }
	//override method
	public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: " + balance);
    }
	 public void withdraw(double amount) 
	 {
	        double availableFunds = balance + overdraftLimit;
	        if (amount <= availableFunds)
	        {
	            balance -= amount;
	            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
	        } else 
	        {
	            System.out.println("Exceeds overdraft limit. Cannot withdraw " + amount);
	        }
	   }
}

public class BankMain {

	public static void main(String[] args) {
		
		//object of saving and current account
		SavingAccount SA = new SavingAccount(1000, 50);
		CurrentAccount CA = new CurrentAccount(2000, 10);
		//will invoke the methods
		SA.deposit(500);
		SA.withdraw(2000);
		CA.deposit(1000);
        CA.withdraw(1500);
	}

}
