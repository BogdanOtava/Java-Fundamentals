// Primitive data types in Java. Not considered objects and represent raw values.

public class Variables {
    public static void main(String[] args) {
        int aValue = 42; // 4 bytes size - stores whole numbers from -2,147,483,648 to 2,147,483,647.
        short aShort = 93; // 2 bytes size - stores whole numbers from -32,768 to 32,767.
        long aLong = 8304; // 8 bytes size - stores whole numbers from -9,223,372,036,854,775,808 to
                           // 9,223,372,036,854,775,807.

        double aDouble = 3.453; // 8 bytes size - stores fractional numbers up to 6 or 7 decimals.
        float aFloat = 5.234f; // 4 bytes size - stores fractional numbers up to 15 decimal digits.

        char aChar = 'b'; // 2 bytes size - stores a single character/letter or ASCII values.
        boolean aBoolean = true; // 1 bit size - stores true or false values.
        byte aByte = 127; // 2 bytes size - stores whole numbers from -128 to 127.

        System.out.println(aValue);
        System.out.println(aShort);
        System.out.println(aLong);
        System.out.println(aDouble);
        System.out.println(aFloat);
        System.out.println(aChar);
        System.out.println(aBoolean);
        System.out.println(aByte);
    }
}
