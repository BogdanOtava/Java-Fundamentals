package FileHandling;

/*
Creating a new file can be done by using 'createNewFile()' method.

NOTE: try/catch block is needed in case the file cannot be created.
*/

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        // Create new file object.
        try {
            File example = new File("example.txt");

            // 'createNewFile()' method returns 'true' if the file was created / 'false' if
            // it wasn't or already exists.
            if (example.createNewFile()) {
                System.out.printf("File created: %s.", example);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException error) {
            System.out.println("ERROR! File could not be created.");
            error.printStackTrace();
        }
    }
}
