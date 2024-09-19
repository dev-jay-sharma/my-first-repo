package com.groot;

import java.util.Scanner;

public class userdivide {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		 
		System.out.println("Enter value of a : ");
		int a=s.nextInt();
		System.out.println("Enter value of b : ");
		int b=s.nextInt();
		int c=a/b;
		
		System.out.println("the value of a/b="+c );
	}

}
