/*
Question: Make a method that returns the first 10 numbers of the Fibonacci Sequence.

Fibonacci series is: the next number is the sum of the two previous numbers. The first two numbers are 0 and 1.

Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, etc.
*/

public class FibonacciSequence {

    // Declare the numbers as static so they can be accessed anywhere in class:
    static int nOne = 0, nTwo = 1, nThree = 0;

    // Create method:
    static void getFibonacci(int endPoint) {
        for (int i = 0; i <= endPoint - 1; i++) {
            System.out.println(nOne);

            nThree = nOne + nTwo;
            nOne = nTwo;
            nTwo = nThree;
        }
    }

    public static void main(String[] args) {

        // Call method:
        getFibonacci(10);
    }
}
