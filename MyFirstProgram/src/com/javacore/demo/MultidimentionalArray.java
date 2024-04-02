package com.javacore.demo;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
		/*double[][] matrix= { //declaration, instantiation,and initialization
				{1.2,4.3,4.0},
				{4.1,1.1},
		};
		double[][]matrix1; // declaration of two dimentional array
		
		double[][] a=new double[3][2]; // instantiation
		
		int[][]a1=new int[3][2];
		String[][]a2= new String[3][2];*/
		
		int[][] a= {
				
				{1,2,3},
				{4,5,6,9},
				{3,2,4}
		};
		System.out.println("lengnth of row 1"+a[0].length);
		
		System.out.println("lengnth of row 2"+a[1].length);
		
		System.out.println("lengnth of row 3"+a[2].length);
		System.out.println(a[1][2]);
		
	//print all the matrix

	}

}
