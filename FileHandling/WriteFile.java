package FileHandling;

/*
Writing in a file is done with the 'write()' method.

NOTE: try/catch block is needed in case file could not be wrote in.
*/

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter pen = new FileWriter("example.txt");

            pen.write("Java is an OOP programming language.");
            pen.close();
        } catch (IOException error) {
            System.out.println("ERROR! Could not write into file.");
            error.printStackTrace();
        }
    }
}
