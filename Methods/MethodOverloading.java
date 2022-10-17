package Methods;

/*
'Method overloading' is when multiple methods have the same name, but with different parameters.
*/

public class MethodOverloading {

    // Create methods:
    static int getSum(int nOne, int nTwo) {
        return nOne + nTwo;
    }

    static double getSum(double nOne, double nTwo) {
        return nOne + nTwo;
    }

    public static void main(String[] args) {

        // Call methods:
        System.out.println(getSum(15, 45));
        System.out.println(getSum(145.5, 95.25));
    }
}
