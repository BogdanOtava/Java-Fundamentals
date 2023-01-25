/* 
Question: Implement the Linear Search algorithm.
*/

import java.util.Scanner;

public class LinearSearch {
    
    // Create method:
    private static int linearSearch(int array[], int target) {
        
        for (int i = 0, length = array.length; i < length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sortedArray[] = new int[10000];

        System.out.println("Target: ");
        int target = input.nextInt();
        input.close();

        for (int i = 0, length = sortedArray.length; i < length; i++) sortedArray[i] = i;

        int index = linearSearch(sortedArray, target);

        if (index == -1) System.out.println("Target not found!");
        else System.out.println("Target found at index: " + index + ".");
    }
}
