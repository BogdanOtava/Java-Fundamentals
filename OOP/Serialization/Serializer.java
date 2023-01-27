package OOP.Serialization;

/* 
Serialization   - is the process of converting an object into a byte stream.
                - persists (saves the state) after program exits.
                - the byte stream can be saves as a file or sent over a network, or a different machine.
                - the byte stream can be saved as a file (.ser) which is platform independent.
                - think of it as if you're saving a file with the object's information
*/

import java.io.*;

public class Serializer {

    public static void main(String[] args) throws IOException {

        UserClass firstUser = new UserClass();

        firstUser.name = "John";
        firstUser.email = "JohnDoe@unknown.com";
        firstUser.password = "verysecurepassword";

        firstUser.sayHello();

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(firstUser);

        out.close();
        fileOut.close();

        System.out.println("Object info saved!");

        long serialVersionUID = ObjectStreamClass.lookup(firstUser.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}
