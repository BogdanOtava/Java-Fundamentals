// Switch statements are used instead of writing many 'If/Else' statements. Variable types supported by the 'Switch' statements are: char, byte, short, int and String.

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your instructions: ");
            String text = input.nextLine();

            switch (text) {
                case "run":
                    System.out.println("Program is running.");
                    break;
                case "stop":
                    System.out.println("Program has stopped.");
                    break;
                default:
                    System.out.println("Instructions unclear.");
            }
        }
    }
}
