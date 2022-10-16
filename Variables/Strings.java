package Variables;

/*
'String' is a non-primitive data type that are used for storing text.
Strings are objects, which contain methods that can perform certain operations.
*/

public class Strings {
    public static void main(String[] args) {

        // Two ways to create a string:
        // Literal String.
        String sayHello = "Hello World!";

        // Object String.
        String sayBye = new String("Bye World!");

        System.out.println(sayHello);
        System.out.println(sayBye);

        // String Methods:
        System.out.println(sayHello.length());
        System.out.println(sayHello.toUpperCase());
        System.out.println(sayHello.toLowerCase());
        System.out.println(sayHello.contains("Hello"));
        System.out.println(sayHello.isEmpty());
        System.out.println(sayHello.isBlank());
        System.out.println(sayHello.startsWith("s"));
        System.out.println(sayHello.endsWith("d"));

        // String Concatenation:
        String firstName = "Markus";
        String lastName = "Holloway";

        System.out.println(firstName + " " + lastName); // -> concatenation by using the '+' operator.
        System.out.println(firstName.concat(lastName)); // -> concatenation by using the .concat() method.

        // String Formatting:
        String language = "Java";
        int year = 1995;

        String formattedString = String.format("%s is a popular programming language, created in %d.", language, year);

        System.out.println(formattedString);
    }
}
