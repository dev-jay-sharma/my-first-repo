import java.util.Scanner;
public class pabbona {
	public static void main(String[] args) { 
int n1=0;
		int n2=1;
		int n3;
		int i=1;
		int sum=0;
		System.out.println("print n1"+n1);
		System.out.println("print n2"+n2);
		sum =sum+n1+n2;
	while(i<=20){
		n3=n1+n2;
		sum=sum+n3;
		System.out.println( n3);
		n1=n2;
		n2=n3;
		i++;
	}
		System.out.println("total"+sum);
		
	
	
	
	
	}
}
