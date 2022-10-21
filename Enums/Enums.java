package Enums;

/*
'Enum' is short for 'enumerations', which means "specifically listed".
Enums can be either inside of a class or outside and they are often used with Switch Statements.

They are a special type of class that represents a group of constants. 
Enums are mainly used to have values that don't change value, like months, days, colors, etc.
*/

public class Enums {
    public static void main(String[] args) {

        // Create an enum:
        enum Level {
            EASY,
            NORMAL,
            HARD,
        }

        // Access enum:
        Level level = Level.EASY;
        System.out.println(level);

        // Use in a Switch Statement:
        switch (level) {
            case EASY:
                System.out.println("The level of the game is set to EASY.");
                break;
            case NORMAL:
                System.out.println("The level of the game is set to NORMAL.");
                break;
            case HARD:
                System.out.println("The level of the game is set to HARD.");
                break;
        }

        // Loop through enum:
        for (Level levels : Level.values()) {
            System.out.println(levels);
        }
    }
}
