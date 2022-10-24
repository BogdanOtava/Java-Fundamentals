package Exceptions;

/*
The 'try' statement allows defining a block of code to be tested for errors while executed.
The 'catch' statement allows defining a block of code to be execute in case an error occurs.
The 'finally' statement allows executing code after the 'try - catch' block, regardless of the result.

These keywords come in pairs.
*/

public class Exceptions {
    public static void main(String[] args) {

        try {
            int[] years = { 1995, 1992, 2001, 2005, 1999 };
            System.out.println(years[7]);
        } catch (Exception error) {
            System.out.println(error);
        } finally {
            System.out.println("Done.");
        }
    }
}
