package FileHandling;

/*
The method 'delete()' is used to delete a file.
*/

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {

        File example = new File("example.txt");

        if (example.delete()) {
            System.out.printf("Deleted the file: %s.", example);
        } else {
            System.out.println("ERROR! Could not delete the file.");
        }
    }
}
