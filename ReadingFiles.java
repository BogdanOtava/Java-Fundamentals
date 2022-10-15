import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) throws FileNotFoundException {

        String readFile = "notes.txt";

        File file = new File(readFile);

        Scanner text = new Scanner(file);

        while (text.hasNextLine()) {
            String line = text.nextLine();

            System.out.println(line);
        }

        text.close();
    }
}
