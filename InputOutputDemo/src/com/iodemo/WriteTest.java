package com.iodemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {

	public static void main(String[] args) throws IOException {
		
		File file =new File("input.txt");
		
		String str="Copy this string to file";
		
		FileWriter writer = new FileWriter(file);
		
		writer.write(str);
		writer.close();
		
	}

}
