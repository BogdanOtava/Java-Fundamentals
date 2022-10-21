package OOP.MiniProjects.SimpleLibrary;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {

    // Declaring the attributes:
    private String name;
    private LocalDate birthDay;
    private ArrayList<Library> books = new ArrayList<Library>();

    // Constructor:
    User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    // Create a getter for the name attribute:
    public String getName() {
        return this.name;
    }

    // Create a getter for the birthDay attribute:
    public String getBirthDay() {
        return this.birthDay.toString();
    }

    // Create a getter to see borrowed books:
    public String borrowedBooks() {
        return this.books.toString();
    }

    // Method for converting birthDay attribute to age:
    public int getAge() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();

        return age;
    }

    // Method to add a book to ArrayList <books>:
    public void borrow(Library book) {
        this.books.add(book);
    }
}
