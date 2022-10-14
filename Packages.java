// Packages are used to group related classes. They are divided into built-in packages and user-defined packages.

// Built-in packages are a library of prewritten classes. The library is divided into packages and classes. You can either import a single class, or the whole package.

import java.util.Scanner; //  This will import from the java.util package, the Scanner class.

class Username {
    public static void main(String[] args) {
        try (Scanner user = new Scanner(System.in)) {
            System.out.println("Enter your username: ");

            String userName = user.nextLine();
            System.out.println("Username set to: " + userName);
        }
    }
}
