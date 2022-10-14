// Input can be obtained with the Scanner class, which is found in the java.util package.

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter input: ");

            String text = input.nextLine();
            System.out.println("Your input is: " + text);
        }
    }
}
