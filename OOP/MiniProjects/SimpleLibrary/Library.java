package OOP.MiniProjects.SimpleLibrary;

public class Library {

    // Declare the attributes:
    private String title;
    private String author;
    private int pageCount;

    // Constructor:
    Library(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Create a getter for the title attribute:
    public String getTitle() {
        return this.title;
    }

    // Create a getter for the author attribute:
    public String getAuthor() {
        return this.author;
    }

    // Create a toString() method to see the object:
    public String toString() {
        return String.format("Title: %s | Author: %s | Pages: %d", this.title, this.author, this.pageCount);
    }
}
