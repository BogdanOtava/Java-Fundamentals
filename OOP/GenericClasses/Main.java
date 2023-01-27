package OOP.GenericClasses;

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
