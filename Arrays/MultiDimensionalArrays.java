package Arrays;

/* 
A 'multidimensional array' is an array of arrays.
*/

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        // Create the array:
        String carBrands[][] = { { "Ford", "Cadillac", "Dodge", "Chrysler", "RAM", "Tesla" },
                { "Aston Martin", "Bentley", "McLaren", "Rolls-Royce" },
                { "Nissan", "Subaru", "Toyota", "Honda" } };

        // Print out the entire array:
        System.out.println(Arrays.deepToString(carBrands));

        // Print out a single element of the array:
        System.out.println(carBrands[0][5]);
    }
}
