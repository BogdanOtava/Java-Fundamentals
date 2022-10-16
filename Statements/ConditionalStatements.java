package Statements;

/*
Java has the following conditional statements:

    * Use if to specify a block of code to be executed, if a specified condition is true
    * Use else to specify a block of code to be executed, if the same condition is false
    * Use else if to specify a new condition to test, if the first condition is false
    * Use switch to specify many alternative blocks of code to be executed
*/

import java.util.Scanner;

class ConditionalStatements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double numberOne = input.nextDouble();

        System.out.println("Enter the second number: ");
        double numberTwo = input.nextDouble();

        input.nextLine();

        System.out.print("Operation type: ");
        String operation = input.nextLine();

        if (operation.equals("+")) {
            System.out.printf("%f + %f = %f \n", numberOne, numberTwo, numberOne + numberTwo);
        } else if (operation.equals("-")) {
            System.out.printf("%f - %f = %f \n", numberOne, numberTwo, numberOne - numberTwo);
        } else if (operation.equals("*")) {
            System.out.printf("%f * %f = %f \n", numberOne, numberTwo, numberOne * numberTwo);
        } else if (operation.equals("/")) {
            if (numberTwo == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                System.out.printf("%f / %f = %f \n", numberOne, numberTwo, numberOne / numberTwo);
            }
        } else {
            System.out.println("Operation type not supported!");
        }

        input.close();
    }
}
