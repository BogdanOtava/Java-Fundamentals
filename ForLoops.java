// 'For Loops' execute a block of code exactly how many times it is specified.

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i += 1) {
            System.out.println("Value is: " + i);
        }

        for (int i = 0; i < 10; i += 1) {
            System.out.printf("Value is: %d\n", i);
        }
    }
}
