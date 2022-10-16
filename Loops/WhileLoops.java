package Loops;

/*
'While Loops' loop through a block of code until a specified condition is met.
*/

public class WhileLoops {
    public static void main(String[] args) {

        // Countdown from 10 to 1:
        int number = 10;

        while (number > 0) {
            System.out.println(number);
            number--;
        }

        // Print out the multiplication table for 5:
        int five = 5;
        int multiplier = 1;

        while (multiplier < 10) {
            System.out.printf("%d * %d = %d \n", five, multiplier, five * multiplier);
            multiplier++;
        }
    }
}
