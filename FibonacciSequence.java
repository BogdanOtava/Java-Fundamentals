/*
Fibonacci series is: the next number is the sum of the two previous numbers. The first two numbers are 0 and 1.

Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
*/

public class FibonacciSequence {

    // Declare the numbers as static so they can be accessed anywhere in class:
    static int nOne = 0, nTwo = 1, nThree = 0;

    // Create method to get the first 10 numbers in the Fibonacci Sequence:
    static void getFibonacci(int endPoint) {
        for (int i = 0; i <= endPoint; i++) {
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
