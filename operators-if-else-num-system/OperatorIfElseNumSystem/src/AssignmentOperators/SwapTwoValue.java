package AssignmentOperators;
import  java.util.Scanner;

// 13/06/2025, Thursday, 08.30 AM

// Swap two values

public class SwapTwoValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide two values to swap: ");
        System.out.print("Enter priceA: ");

        int priceA = scanner.nextInt();

        System.out.print("Enter priceB: ");
        int priceB = scanner.nextInt();

        System.out.println("Price of priceA BEFORE swap: " + priceA);
        System.out.println("Price of priceB BEFORE swap: " + priceB + "\n");

        int priceC = priceA;
        priceA = priceB;
        priceB = priceC;

        System.out.println("Price of priceA AFTER swap: " + priceA);
        System.out.println("Price of priceB AFTER swap: " + priceB);



    }
}
