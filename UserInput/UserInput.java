package UserInput;

/*
Input can be obtained with the Scanner class, which is found in the java.util package.
*/

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("What programming language is this? ");

            String language = input.nextLine();

            System.out.println("Your answer is: " + language);
        }
    }
}
