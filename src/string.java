import java.util.Scanner;
public class string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age =");
		int age=sc.nextInt(); 
		System.out.println("Please enter your country=");
		String cname =sc.next();
		if(age>=18 && cname.equals("india")) {
			System.out.println("welcomer for voting");}
			else{
				System.out.println("invalid age or you are not indian ");
			}
				
		}
		
	}
	

