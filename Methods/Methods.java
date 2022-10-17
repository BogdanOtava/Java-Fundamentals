package Methods;

/*
Methods are blocks of code that run only when called. They are also knows as functions.
Methods accept arguments as parameters.

NOTE:
    * Methods that don't return a value have the keyword 'void'.
    * Methods that return a value (ex: primitive data types), instead of void will be declared the value and the 'return' keyword will be used inside the method.
*/

public class Methods {

    // Create method without parameters:
    static void sayHello() {
        System.out.println("Hello World!");
    }

    // Create method with parameters:
    static void sayBye(String name) {
        System.out.println("Goodbye, " + name + "!");
    }

    // Create method with parameters that returns a value:
    static double getSum(double nOne, double nTwo) {
        return nOne + nTwo;
    }

    public static void main(String[] args) {

        String myName = "Mike";

        // Call method:
        sayHello();
        sayBye(myName);
        System.out.println(getSum(142.5, 23.2));
    }
}
