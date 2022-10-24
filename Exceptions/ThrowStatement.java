package Exceptions;

/*
The 'throw' statement allows creation of custom errors.
It is used together with an exception type.
*/

public class ThrowStatement {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied! You must be at least 18 years old.");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
