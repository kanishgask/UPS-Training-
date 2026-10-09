package scannerpractice;
import java.util.Scanner;


public class Arithmetic {
	
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		System.out.println("Enter your Number1:"+n1);
		System.out.println("Enter your Number2:"+n2);
		
		System.out.println("Addition : "+ (n1+n2));
		System.out.println("Subraction: "+(n1-n2));
		System.out.println("Multiplication: "+(n1*n2));
		System.out.println("Division: "+(n1/n2));
		System.out.println("Modulo: "+(n1%n2));

		}

}
