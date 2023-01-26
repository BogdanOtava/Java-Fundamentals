package Exceptions;

import java.util.InputMismatchException;

/*
The 'try' statement allows defining a block of code to be tested for errors while executed.
The 'catch' statement allows defining a block of code to be execute in case an error occurs.
The 'finally' statement allows executing code after the 'try - catch' block, regardless of the result.

These keywords come in pairs.
*/

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the first number to divide: ");
            int firstNumber = input.nextInt();
            
            System.out.print("Enter the second number to divide by: ");
            int secondNumber = input.nextInt();

            System.out.println("Result is: " + (firstNumber / secondNumber));
        } 
        catch (ArithmeticException error) {
            System.out.println("Can't divide a number by zero.");
        }
        catch (InputMismatchException error) {
            System.out.println("Input must be a whole number.");
        } 
        finally {
            input.close();
        }
    }
}
