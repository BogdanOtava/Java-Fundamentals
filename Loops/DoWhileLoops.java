package Loops;

/*
'Do/While Loop' is a variant of the 'While Loop'.
This loop executes the code once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
*/

public class DoWhileLoops {
    public static void main(String[] args) {

        // Print out the multiplication table for 5:
        int number = 5;
        int multiplier = 1;

        do {
            System.out.printf("%d * %d = %d \n", number, multiplier, number * multiplier);
            multiplier++;
        } while (multiplier <= 10);
    }
}
