// It's an array of arrays. To access elements, there are two indexes: first for the array number and second for the element inside that array.

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] oneDimensionalArray = { 12, 49, 922 };
        System.out.println(oneDimensionalArray[1]);

        int[][] multiDimensionalArray = { { 12, 49, 922 }, { 23, 56, 78, 12 }, { 12, 34, 56 } };
        System.out.println(multiDimensionalArray[1][3]);

        double[][] doublearray = new double[4][2];

        doublearray[3][1] = 2.6;
        System.out.println(doublearray[3][1]);

        for (int array = 0; array < multiDimensionalArray.length; array++) {
            for (int item = 0; item < multiDimensionalArray[array].length; item++) {
                System.out.println(multiDimensionalArray[array][item] + "\t");
            }
            System.out.println();
        }
    }
}
