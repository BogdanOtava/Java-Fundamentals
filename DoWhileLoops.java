// 'Do/While' is a variant of the 'While Loop'. It will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number = 0;

            do {
                System.out.println("Enter a number: ");
                number = input.nextInt();
            } while (number != 9);
        }
        System.out.println("You  got 9!");
    }
}
