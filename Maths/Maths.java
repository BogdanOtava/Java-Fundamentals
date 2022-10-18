package Maths;

/*
The Math class has methods that perform mathematical tasks on number.
*/

public class Maths {
    public static void main(String[] args) {

        // Absolute value:
        System.out.println(Math.abs(-352.12));

        // Highest value of two data types:
        System.out.println(Math.max(16852563, 7112334));

        // Lowest value of two data types:
        System.out.println(Math.min(4451234, 86354));

        // Square root:
        System.out.println(Math.sqrt(64));

        // Get a random number from 0 to 100:
        int randomNumber = (int) (Math.random() * 101);

        System.out.println(randomNumber);

        // Round to the nearest integer:
        System.out.println(Math.round(465.52));
    }
}