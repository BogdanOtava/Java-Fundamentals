package Loops;

/*
'For Loops' execute a block of code exactly how many times it is specified.

Has three main components:
    * the first component is executed once, for example initializing a variable.
    * the second component is the condition that executes the code block.
    * the third component is executed only after the code block.
*/

public class ForLoops {
    public static void main(String[] args) {

        // Loop to 10:
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // Loop through an array:
        String tvShows[] = { "The Office", "Friends", "Two and a Half Men",
                "Seinfeld", "Community" };

        for (int showNumber = 0; showNumber < tvShows.length; showNumber++) {
            System.out.println(tvShows[showNumber]);
        }

        // For-each loop that loops exclusively through arrays:
        for (String i : tvShows) {
            System.out.println(i);
        }

        // Print out the sum of all numbers from 1 to 10:
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum += i;
        }

        System.out.println(sum);

        // Print out the multiplication table for all numbers from 1 to 9:
        for (int i = 1; i < 10; i++) {
            for (int multiplier = 1; multiplier < 10; multiplier++) {
                System.out.printf("%d * %d = %d \n", i, multiplier, i * multiplier);
            }
        }
    }
}
