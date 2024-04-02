package com.iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fos =new FileOutputStream("pDetails.txt");
		
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		Person p = new Person(101, "Kaushik");
		
		os.writeObject(p);
		
		os.close();
		fos.close();
		
		System.out.println("File Created");
		System.out.println("=====");
		System.out.println("Reading Object form file i.e deserializtion");
		
		FileInputStream fis = new FileInputStream("pDetails.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p1= (Person) ois.readObject();
		
		//object to primitive type conversion

		System.out.println(p1.getpId());//person object  ----------pid int pname string
		System.out.println(p1.getpName());
		
		ois.close();
		fis.close();
	}

}
