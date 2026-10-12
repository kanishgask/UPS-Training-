package ArithmeticOperator;
import java.util.Scanner;

public class ternarydiscount {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter threshold amount: ");
        double threshold = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double percentage = sc.nextDouble();

        double discount = (amount > threshold)
                          ? amount * percentage / 100
                          : 0;

        double finalAmount = amount - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);

        sc.close();
    }
}



