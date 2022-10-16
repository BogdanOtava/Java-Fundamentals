package Variables;

/*
Operators are used to perform operations on variables and values.
*/

public class Operators {
    public static void main(String[] args) {

        int numberOne = 10;
        int numberTwo = 3;

        // Arithmetic Operators:
        System.out.println(numberOne + numberTwo); // Addition.
        System.out.println(numberOne - numberTwo); // Substraction.
        System.out.println(numberOne * numberTwo); // Multiplication.
        System.out.println(numberOne / numberTwo); // Division.
        System.out.println(numberOne % numberTwo); // Modulus - returns the division remainder.
        System.out.println(++numberOne); // Increment - increases the value of the variable by 1.
        System.out.println(--numberOne); // Decrement - decreases the value of the variable by 1.

        // Assignment Operators:
        int numberThree = 15; // the '=' operator.

        System.out.println(numberThree);

        numberThree += 5; // same as numberThree = numberThree + 5.
        numberThree -= 5; // same as numberThree = numberThree - 5.
        numberThree *= 5; // same as numberThree = numberThree * 5.
        numberThree /= 5; // same as numberThree = numberThree / 5.
        numberThree %= 5; // same as numberThree = numberThree % 5.

        // Comparison Operators:
        System.out.println(numberOne == numberTwo); // Equal to.
        System.out.println(numberOne != numberTwo); // Not equal.
        System.out.println(numberOne > numberTwo); // Greater than.
        System.out.println(numberOne < numberTwo); // Less than.
        System.out.println(numberOne >= numberTwo); // Greater than or equal to.
        System.out.println(numberOne <= numberTwo); // Less than or equal to.

        // Logical Operators:
        System.out.println(numberOne < 15 && numberTwo > 1); // '&&' is the logical 'and'.
        System.out.println(numberOne < 15 || numberTwo > 1); // '||' is the logical 'or'.
        System.out.println(!(numberOne < 15 && numberTwo > 1)); // '!' is the logical 'not'.
    }
}
