package OOP.SimpleLibrary;

public class Main {
    public static void main(String[] args) {

        // Create new object from class User:
        User userOne = new User("Mike Smith", "2000-04-28");
        User userTwo = new User("Will Harper", "1998-07-21");
        User userThree = new User("Georgia Brown", "1997-03-08");

        // Create new object from class Library:
        Library bookOne = new Library("Java: A Beginner's Guide", "Herbert Schildt", 720);
        Library bookTwo = new Library("Head First Design Patterns", "Eric Freeman", 669);
        Library bookThree = new Library("Thinking in Java", "Bruce Eckel", 689);

        // Create new object from class AudioLibrary:
        AudioLibrary audioBookOne = new AudioLibrary("Effective Java", "Joshua Bloch", 12160);
        AudioLibrary audioBookTwo = new AudioLibrary("Test Driven Java Development", "Alex Garcia & Viktor Farcic",
                18220);

        userOne.borrow(bookThree);
        userOne.borrow(audioBookTwo);

        userTwo.borrow(audioBookOne);

        userThree.borrow(bookOne);
        userThree.borrow(bookTwo);

        System.out.printf("Name: %s \nAge: %s\nBorrowed Books: %s\n", userOne.getName(), userOne.getAge(),
                userOne.borrowedBooks());
    }
}
