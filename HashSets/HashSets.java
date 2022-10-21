package HashSets;

/*
'HashSets' contain a collection of items where evey item is unique.

Elements inside an HashSet are actually objects. 
To create a HashSet with a primitive type, the wrapper class is needed: Integer for int, Boolean for booleans, etc.
*/

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {

        // Create new HashSet:
        HashSet<String> movies = new HashSet<String>();

        movies.add("Interstellar");
        movies.add("Inception");
        movies.add("Dunkirk");
        movies.add("The Revenant");
        movies.add("Once Upon a Time in Hollywood");

        // Check if an element is in the HashSet:
        System.out.println(movies.contains("Dunkirk"));

        // Remove element:
        movies.remove("Inception");
        System.out.println(movies);

        // Check size:
        System.out.println(movies.size());

        // Loop through HashSet:
        for (String i : movies) {
            System.out.println(i);
        }
    }
}
