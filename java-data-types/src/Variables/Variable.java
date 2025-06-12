package Variables;

// 12/06/2025, Wednesday, 07.30 AM

// int myAge = 10;

// int => data type
// myAge => identifier
// 10 => literal

// the word that is used to refer to the value of a variable
// is known as "identifier".

// the value that is stored in a variable is known as "literal"


public class Variable {
    public static void main(String[] args) {

        int newAge; // variable declaration

        int age = 190; // variable initialization

        newAge = 210; // update value of declared variable

        System.out.println(newAge);

        // boolean value
        boolean isVerified = true;

        System.out.println(isVerified);

        // float
        float myFloatValue = 5;

        float myNewFloat = 5.0f; // can not initilize with "value.0" in float
        // we need to initialize as: "value.0f" or "value.0F" if we want to initialize
        // value with decimal.

        System.out.println(myFloatValue);

        // double
        double helloDouble = 4.345;

        double helloDouble2 = 5;
        System.out.println(helloDouble2);

        // string
        String hello = "Hello Hi";
        System.out.println(hello);

        String hello2;

        hello2 = "Ok";

        System.out.println(hello2);

        hello = "new Hello Hi";

        System.out.println(hello);




    }
}
