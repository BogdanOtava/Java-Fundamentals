package Statements;

/*
The 'switch' statement selects one of many code blocks to be executed.

The switch expression is evaluated once and it is compared with the values of each case. 
If there's a match, the associated code will be executed.

Use 'default' keyword, so that block of code is executed when none of the cases are matched.
Use 'break' keyword to break out of the switch block.
*/

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double numberOne = input.nextDouble();

        System.out.println("Enter the second number: ");
        double numberTwo = input.nextDouble();

        input.nextLine();

        System.out.print("Operation type: ");
        String operation = input.nextLine();

        switch (operation) {
            case "+":
                System.out.printf("%f + %f = %f \n", numberOne, numberTwo, numberOne + numberTwo);
                break;
            case "-":
                System.out.printf("%f - %f = %f \n", numberOne, numberTwo, numberOne - numberTwo);
                break;
            case "*":
                System.out.printf("%f * %f = %f \n", numberOne, numberTwo, numberOne * numberTwo);
                break;
            case "/":
                if (numberTwo == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.printf("%f / %f = %f \n", numberOne, numberTwo, numberOne / numberTwo);
                }
                break;
            default:
                System.out.println("Operation type not supported!");
        }

        input.close();
    }
}
