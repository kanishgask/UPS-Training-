package scannerpractice;
import java.util.Scanner;


public class Arithmetic {
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter your Number1:");
		int n1=sc.nextInt();
		System.out.print("Enter your Number2:");
		int n2=sc.nextInt();
		
		System.out.println("Addition : "+ (n1+n2));
		System.out.println("Subraction: "+Math.abs(n1-n2));
		System.out.println("Multiplication: "+(n1*n2));
		System.out.println("Division: "+(n1/n2));
		System.out.println("Modulo: "+(n1%n2));
		System.out.println("Maximum: "+ Math.max(n1,n2));
		System.out.println("Minimum: "+Math.min(n1, n2));
		

		}

}
