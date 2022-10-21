package ArrayLists;

/*
'ArrayList' is a resizable Array.
The difference between those two is that the size of the built-in Array cannot be modified, while element can be added or removed from an ArrayList.
*/

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args) {

        // Create a new ArrayList:
        ArrayList<String> games = new ArrayList<String>();

        // Add elements:
        games.add("Cyberpunk 2077");
        games.add("The Witcher 3");
        games.add("Red Dead Redemption 2");
        games.add("Assassin's Creed: Valhalla");
        games.add("God of War");

        // Remove elements by index:
        games.remove(2);

        // Remove elements by value:
        games.remove(String.valueOf("God of War"));

        // Print out number of element in ArrayList:
        System.out.println(games.size());

        // Print out the entire ArrayList:
        System.out.println(games.toString());

        // Print out a specific element:
        System.out.println(games.get(1));

        // Check if element is in ArrayList:
        System.out.println(games.contains("God of War"));

        // Change element:
        games.set(0, "Days Gone");
        System.out.println(games.toString());

        // Sort ArrayList alphabetically:
        games.sort(Comparator.naturalOrder());
        System.out.println(games.toString());

        // Sort ArrayList in reverse order:
        games.sort(Comparator.reverseOrder());
        System.out.println(games.toString());

        // Clear the ArrayList:
        games.clear();
        System.out.println(games.toString());
    }
}
