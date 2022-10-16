package FileHandling;

/*
To read from a file, the 'Scanner' class is needed.

NOTE: The try/catch block is needed in case the file could not be found.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        try {
            File readFile = new File("FileHandling/aboutFiles.txt");
            Scanner reader = new Scanner(readFile);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (FileNotFoundException error) {
            System.out.println("ERROR! File could not be found.");
            error.printStackTrace();
        }
    }
}
