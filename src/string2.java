import java.util.Scanner;

public class string2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age =");
		int age=sc.nextInt(); 
		if(age>=18) {
			System.out.println("Enter cuntry name : ");
			String cname =sc.next();
			if(cname.equals("india")) {
				System.out.println("welcomer for voting");}
			else {
				System.out.println("invalid country name");}
				
			}else {
				System.out.println("invalid age ");}
	
	
	}}
