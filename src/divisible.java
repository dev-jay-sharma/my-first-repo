import java.util.Scanner;
public class divisible {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("please enter our number : ");
		int x=s.nextInt();
		if (x%5==0 && x%11==0) {
			System.out.println("it is divisible by both ");
		} else if (x%5!=0 && x%11==0) {
			System.out.println("it is divisible by 11 ");
		} else if (x%5==0 && x%11!=0) {
			System.out.println("it is divisible by 5 ");
		} else if (x%5!=0 && x%11!=0) {
			System.out.println("it is not divisible by both ");
		}
		
		
	}

}
