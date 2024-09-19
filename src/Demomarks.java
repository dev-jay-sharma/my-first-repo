import java.util.Scanner;

public class Demomarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your marks");
		int marks = sc.nextInt();
		if (marks >= 0 && marks <= 40) {
			System.out.println("fail");
		} else if (marks >= 40 && marks <= 60) {
			System.out.println("pass");
		} else if (marks >= 60 && marks <= 70) {
			System.out.println("c grade");
		} else if (marks >= 70 && marks <= 80) {
			System.out.println("B grade");
		} else if (marks >= 80 && marks <= 90) {
			System.out.println("A grade");
		} else if (marks >= 90 && marks <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid condition");

		}

	}
}