/*
Question: Write a method that takes an integer as parameter and checks all numbers until that point if they are multiples of 3, 5 or 3 and 5.

If number is multiple of 3 - print Buzz;
If number is multiple of 5 - print Fizz;
If number is multiple of 3 and 5 - print FizzBuzz;
If number is not multiple of 3 or 5 - print number.
*/

public class FizzBuzz {

    static void checkFizzBuzz(int endPoint) {

        for (int i = 0; i <= endPoint; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz!");
            } else if (i % 5 == 0) {
                System.out.println("Buzz!");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        checkFizzBuzz(100);
    }
}
