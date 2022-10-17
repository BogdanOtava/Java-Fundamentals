package Methods;

/*
Recursion is the tehnique of making a function call itself.
*/

public class Recursion {

    // Print 'Hello World!' 5 times:
    static int count = 0;

    static void sayHello() {
        count++;

        if (count <= 5) {
            System.out.println("Hello World!");
            sayHello();
        }
    }

    // Get factorial number of 10:
    static int getFactorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return (number * getFactorial(number - 1));
        }
    }

    public static void main(String[] args) {

        // Call method:
        sayHello();
        System.out.println(getFactorial(10));
    }
}
