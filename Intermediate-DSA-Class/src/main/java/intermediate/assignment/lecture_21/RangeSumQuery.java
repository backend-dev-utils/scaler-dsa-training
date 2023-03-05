package intermediate.assignment.lecture_21;

import java.util.Arrays;

public class RangeSumQuery {
    public static void main(String[] args) {
        int array[] = {7, 3, 1, 5, 5, 5, 1, 2, 4, 5};
        int rangeArray[][] = {{7, 10}, {3, 10}, {3, 5}, {1, 10}};
        long resultArray[] = findRangeSumOfArrayElements(array, rangeArray);
        System.out.println(Arrays.toString(resultArray));
    }

    private static long[] findRangeSumOfArrayElements(int[] array, int[][] rangeArray) {

        long prefixSumOfArray[] = new long[array.length+1];
        prefixSumOfArray[0] = 0;
        for (int indexPoint = 1; indexPoint <= array.length; indexPoint++) {
            prefixSumOfArray[indexPoint] = prefixSumOfArray[indexPoint-1] + array[indexPoint-1];
        }
//        System.out.println(Arrays.toString(prefixSumOfArray));
        long resultArray[] = new long[rangeArray.length];

        for (int rows = 0; rows < rangeArray.length; rows++) {
            int startIndex = rangeArray[rows][0];
            int lastIndex = rangeArray[rows][1];
            resultArray[rows] = prefixSumOfArray[lastIndex] - prefixSumOfArray[startIndex-1];
        }
        return resultArray;
    }
}
