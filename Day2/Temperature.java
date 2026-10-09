package scannerpractice;
import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Celsius:");
		int c=sc.nextInt();
		float kelvin=c+273.15f;
		
		float temp=(c*9/5)+32;
		
		System.out.println("Enter the Kelvin Value"+kelvin);
		
		System.out.print("The temperature Of the room is "+temp+ " "+"Kelvin");
		
		
		
	}

}
