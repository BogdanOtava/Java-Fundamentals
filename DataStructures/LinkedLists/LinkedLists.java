package LinkedLists;

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
