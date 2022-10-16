package Variables;

/*
Primitive data types in Java. 
Not considered objects and represent raw values. T
hey have no additional methods.
*/

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        // Integer Types:
        byte aByte = 100; // -128 to 127.
        short aShort = 20000; // -32768 to 32767.
        int anInteger = 214142; // -2147483648 to 2147483647.
        long aLarge = 92233744445L; // -9223372036854775808 to 9223372036854775807.

        // Decimal Types:
        double aDouble = 1.795523; // 4.9E-324 to 1.7976931348623157E308.
        float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38.

        // Boolean Types:
        boolean isWeekend = false;
        boolean isWeekday = true;

        // Character Types:
        char copyrightSymbol = '\u00A9';

        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(anInteger);
        System.out.println(aLarge);

        System.out.println(aDouble);
        System.out.println(aFloat);

        System.out.println(isWeekend);
        System.out.println(isWeekday);

        System.out.println(copyrightSymbol);

    }
}
