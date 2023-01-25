/*
Question: Implement the Binary Search algorithm.
*/

import java.util.Scanner;

public class BinarySearch {

    // Create method:
    private static int binarySearch(int array[], int target) {

        int low = 0;
        int high = array.length - 1;
    
        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];
    
            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle;
    
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sortedArray[] = new int[10000];

        System.out.print("Target: ");
        int target = input.nextInt();
        input.close();

        for (int i = 0, length = sortedArray.length; i < length; i++) sortedArray[i] = i;

        int index = binarySearch(sortedArray, target);

        if (index == -1) System.out.println("Target not found!");
        else System.out.println("Target found at index: " + index + ".");
    }
}
