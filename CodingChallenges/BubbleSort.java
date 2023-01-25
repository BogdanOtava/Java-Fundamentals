/*
Question: Implement the Bubble Sort algorithm.
*/

public class BubbleSort {

    // Create method:
    private static void bubbleSort(int array[]) {

        for (int i = 0, n = array.length - 1; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Swap the first number with the second if it's bigger
                if (array[j] > array[j + 1]) {
                    int temp = array[j];

                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int unsortedArray[] = {9, 5, 8, 4, 1, 3, 2, 7, 6, 10};

        bubbleSort(unsortedArray);
        for (int i : unsortedArray) System.out.println(i);
    }
}
