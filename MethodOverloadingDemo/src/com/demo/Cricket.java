package com.demo;

class Game
{
	public void Type()
	{
		System.out.println("Indoor & outdoor");
	}
}

public class Cricket extends Game {
	
	public void Type()
	{
		System.out.println("Cricket is outdoor game");
	}

	public static void main(String[] args) {
		
		Game gm = new Game();
		gm.Type();//call game class method
		
		Cricket ck=new Cricket();
		ck.Type();// call cricket class method
		
		gm=ck;// gm refers to cricket object
		gm.Type();// call cricket class method

	}

}
