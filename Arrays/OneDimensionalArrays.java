package Arrays;

/* 
'Arrays' are used to store multiple values in a single variable.
Arrays indexes start at 0.
*/

import java.util.Arrays;

public class OneDimensionalArrays {
    public static void main(String[] args) {

        // Create the array array:
        String languages[] = { "Python", "Java", "C", "C++", "C#", "R", "Kotlin", "Go", "PHP", "Ruby", "Rust" };

        // Print out the entire array:
        System.out.println(Arrays.toString(languages));

        // Print out a single element of the array:
        System.out.println(languages[0]);

        // See total number of elements in array:
        System.out.println(languages.length);

        // Sort array alphabetically:
        Arrays.sort(languages);
        System.out.println(Arrays.toString(languages));

        // Change element in array:
        languages[6] = "JavaScript";
        System.out.println(Arrays.toString(languages));

        // Search for element in array:
        String language = "Java";

        int itemIndex = Arrays.binarySearch(languages, language);
        System.out.println(itemIndex);

        // Loop through an array:
        for (int i = 0; i < languages.length; i++) {
            System.out.println(languages[i]);
        }

        // Make a copy of an array:
        String languagesCopy[] = Arrays.copyOf(languages, languages.length);
        System.out.println(Arrays.toString(languagesCopy));
    }
}
