package Lambdas;

/*
'Lambda expressions' are a short block of code that take in some parameters are return a value.
They are similar to methods, but they can be implemented straight in the body of the method.
*/

import java.util.ArrayList;

public class Lambdas {
    public static void main(String[] args) {

        // Loop through an ArrayList with a lambda expression:
        ArrayList<Integer> ages = new ArrayList<>();

        ages.add(32);
        ages.add(28);
        ages.add(35);
        ages.add(25);
        ages.add(30);

        ages.forEach((i) -> {
            System.out.println(i);
        });
    }
}
