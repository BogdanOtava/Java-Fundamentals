package Methods;

/*
Generics means parameterized types. They allow reference types like Integer, String, etc and user-defined types to be a parameter to methods, classes and interfaces.
By using generics it's possible to create classes that work with different data types.
An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
*/

public class GenericMethods {
    
    public static void main(String[] args) {

        Integer intArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double doubleArray[] = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        Character charArray[] = {'H', 'E', 'L', 'L', 'O'};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);

        System.out.println(getFirstElement(intArray));
        System.out.println(getFirstElement(doubleArray));
        System.out.println(getFirstElement(charArray));
    }

    // Method that takes an array of a reference type
    public static <T> void displayArray(T array[]) {

        for (T i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Method that returns something generic
    public static <T> T getFirstElement(T array[]) {
        return array[0];
    }
}
