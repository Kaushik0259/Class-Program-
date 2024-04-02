package com.iodemo;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveIoDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("primitive.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(false);
		dos.writeInt(20);
		dos.writeDouble(2.4);
		dos.close();
		fos.close();
		
		System.out.println("File create hua");
		System.out.println("=====");
		System.out.println("File reading");
		
		FileInputStream fis = new FileInputStream("primitive.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		
		dis.close();
		fis.close();
	}

}
