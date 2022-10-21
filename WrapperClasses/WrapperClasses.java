package WrapperClasses;

/*
'Wrapper classes' provide a way to use primitive data types as objects.

They are used when working with structures such as ArrayLists, HashSets, HashMaps, because primitive types cannot be used, just objects.

byte    - Byte
short   - Short
int     - Integer
long    - Long
float   - Float
double  - Double
boolean - Boolean
char    - Character
*/

import java.util.ArrayList;
import java.util.HashSet;

public class WrapperClasses {

    public static void main(String[] args) {

        // Create an ArrayList of Integers:
        ArrayList<Integer> ages = new ArrayList<Integer>();
        System.out.println(ages.toString());

        // Create a HashSet of Characters:
        HashSet<Character> notes = new HashSet<Character>();
        System.out.println(notes.toString());
    }
}
