/* 
Question: Implement the Selection Sort algorithm.
*/

public class SelectionSort {
    
    // Create method:
    private static void selectionSort(int array[]) {

        for (int i = 0, length = array.length; i < length; i++) {
            int min = i;

            // Find the lowest element in array
            for (int j = i + 1; j < length; j++)
            {
                if (array[min] > array[j]) min = j;
            }

            // Swap the lowest element found with the first element
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    public static void main(String[] args) {

        int unsortedArray[] = {10, 4, 8, 9, 5, 6, 2, 1, 3, 7};

        selectionSort(unsortedArray);
        for (int i : unsortedArray) System.out.println(i);
    }
}
