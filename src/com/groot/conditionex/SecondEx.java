package com.groot.conditionex;

import java.util.Scanner;

public class SecondEx {
	
	public static void main(String[] args) {
		System.out.println("Please enter value of a=");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a % 5 == 0) {
				System.out.println("Number is even");
			} else {
				System.out.println("Number is odd");
			}
		}
}
