package com.groot.conditionex;

import java.util.Scanner;

public class Ageclass {

	public static void main(String[] args) {
		System.out.println("Please enter value of your age :: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Welcome for voting");
		} else {
			System.out.println("Invalid age");
		}
	}
}
