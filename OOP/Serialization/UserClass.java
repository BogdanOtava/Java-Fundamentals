package OOP.Serialization;

import java.io.Serializable;

public class UserClass implements Serializable {
    
    private static final long serialVersionUID = 1;
    String name;
    String email;
    transient String password;

    public void sayHello() {
        System.out.println("Welcome " + name + "!");
    }
}
