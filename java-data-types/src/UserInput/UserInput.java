package UserInput;
import java.util.Scanner;

// 12/06/2025, Wednesday, 10.30 AM


public class UserInput {
    public static void main(String[] args) {

        // Create an object of the Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Good morning: " + name);

        System.out.println("Please tell your age: ");

        int age = scanner.nextInt();

        System.out.println("Your age is: " + age);

        System.out.println("Please enter floating value: ");

        float fltValue = scanner.nextFloat();

        System.out.println("The float value is: " + fltValue);

    }
}
