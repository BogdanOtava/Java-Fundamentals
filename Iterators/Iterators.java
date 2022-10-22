package Iterators;

/*
'Iterators' are objects used to loop through collections such as ArrayLists or HashSets.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {

        // Create a new collection and add elements to it:
        ArrayList<String> sitComs = new ArrayList<>();

        sitComs.add("Friends");
        sitComs.add("That '70s Show");
        sitComs.add("Two and a Half Men");
        sitComs.add("How I Met Your Mother");
        sitComs.add("The Office");
        sitComs.add("Seinfeld");

        // Get the iterator:
        Iterator<String> it = sitComs.iterator();

        // Print the first item:
        System.out.println(it.next());

        // Loop through collection:
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
