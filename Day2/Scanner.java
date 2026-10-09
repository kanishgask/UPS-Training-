package scannerpractice;
import java.util.Scanner;


public class demo {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your Name : ");
		String s=sc.nextLine();
		System.out.print("Enter your Phone number: ");
		long num=sc.nextLong();
		System.out.print("Enter your Age: ");
		int age=sc.nextInt();
		
		System.out.print("Enter your Registration Number :");
		long reg=sc.nextLong();
		
		System.out.print("Enter your Height :");
		Double height=sc.nextDouble();
		
		
		System.out.println("My name is "+s);
		System.out.println("My Age is "+age);
		System.out.println("My Phone number is "+num);
		System.out.println("My registration number is "+reg);
		System.out.println("My Height is "+height);
		
		
		
		
		

	}

}
