// Java supports the usual logical conditions from mathematics. Useful for performing different actions for different decisions.

public class IfStatements {
    public static void main(String[] args) {
        int amount = 0;

        while (true) {
            System.out.println(amount);

            if (amount == 6) {
                break;
            }
            amount++;
        }

        System.out.println("Done.");
    }
}
