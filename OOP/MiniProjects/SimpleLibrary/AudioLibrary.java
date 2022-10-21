package OOP.MiniProjects.SimpleLibrary;

// Class that inherits attributes and methods from 'Library' class.
public class AudioLibrary extends Library {

    // Declare a new attribute, unique to this class:
    private int runTime;

    // Constructor / Initialize the other attributes from the inherited parent
    // class:
    AudioLibrary(String title, String author, int runTime) {
        super(title, author, 0);
        this.runTime = runTime;
    }

    // Create getter to see the runTime attribute:
    public int getRunTime() {
        return this.runTime;
    }
}
