package LinkedLists;

/*
ArrayLists and LinkedLists are very similar. 
They both contain many objects of the same type, and share the same methods because both classes implement the 'List' interface.

While ArrayLists are used for storing and accessing data, LinkedLists are mainly used to manipulate data. For this, LinkedLists have several methods to do certain operations more efficiently.
*/

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        // Create a new Linked List:
        LinkedList<String> carBrands = new LinkedList<String>();

        // Add elements:
        carBrands.add("Ford");
        carBrands.add("Toyota");
        carBrands.add("Alfa Romeo");
        carBrands.add("Audi");
        carBrands.add("Porsche");

        // Print out the entire LinkedList:
        System.out.println(carBrands);

        // Add element to the beginning:
        carBrands.addFirst("Maseratti");

        // Add element to the end:
        carBrands.addLast("Ferrari");

        // Remove first element:
        carBrands.removeFirst();

        // Remove last element:
        carBrands.removeLast();

        // Get the first item:
        System.out.println(carBrands.getFirst());

        // Get the last item:
        System.out.println(carBrands.getLast());
    }
}
