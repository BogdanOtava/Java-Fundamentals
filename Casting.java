// Casting is when you assing a value of one primitive data type to another.
// There are two types of casting: widening casting & narrowing casting.

// Widening casting is done automatically when passing smaller size type to a larger size type.
// Narrowing casting is done manually by specifing the type.

public class Casting {
    public static void main(String[] args) {

        int intValue = 3;
        short shortValue = 38;
        long longValue = 93024;

        float floatValue = 923.5f;

        // See the maximum and minimum values that variables can store.
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        // Widening casting:
        double newValue = shortValue;
        System.out.println(newValue);

        // Narrowing casting:
        intValue = (int) longValue;
        System.out.println(intValue);

        intValue = (int) floatValue;
        System.out.println(intValue);
    }
}
