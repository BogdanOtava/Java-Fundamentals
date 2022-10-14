// Constructors are special methods that are used to initialize objects. It is called when the object is created.

// Create a 'Constructors' class.
public class Constructors {
    int x; // Create a class attribute.

    // Create a class constructor for 'Constructors' class.
    public Constructors() {
        x = 15; // Set initial value for the class attribute 'x'.
    }

    public static void main(String[] args) {
        Constructors object = new Constructors();
        System.out.println(object.x);
    }
}
