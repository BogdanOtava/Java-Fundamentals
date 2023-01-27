package OOP.GenericClasses;

/*
A generic class simply means that the items or functions in that class can be generalized with the parameter ('T') to specify that we can add any type as a parameter in place of 'T' such as reference types or user-defined types.

We can restrict the types that can be used as type arguments in a parameterized type.

Syntax: <T extends className>
*/

public class Main {

    public static void main(String[] args ) {
        GenericClass<Integer> myInt = new GenericClass<>(1);
        GenericClass<Double> myDouble = new GenericClass<>(3.14);
        GenericClass<Character> myChar = new GenericClass<>('C');

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
    }
}
