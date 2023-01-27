package OOP.Serialization;

/* 
Deserialization - the reverse process of converting a byte stream into an object.
                - think of it as if you're loading a saved file.
*/

import java.io.*;

public class Deserializer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        UserClass firstUser = null;

        FileInputStream fileIn = new FileInputStream("UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        firstUser = (UserClass) in.readObject();

        in.close();
        fileIn.close();

        System.out.println(firstUser.name);
    }
}
