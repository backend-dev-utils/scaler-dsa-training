package intermediate.assignment.lecture_21;

import java.util.Arrays;

/**
 * Optimized approach
 */
public class CountWaysOddEvenIndexedElementSumBecomeEqual_2 {
    public static void main(String[] args) {
        int array[] = {2, 1, 6, 4};
//             index = 0, 1, 2, 3
        int count = findCountWaysOddEvenIndexedElementSumBecomeEqual(array);
        System.out.println(count);
    }

    private static int findCountWaysOddEvenIndexedElementSumBecomeEqual(int[] array) {
        int count = 0;
        int[] prefixSumOfOddIndexedArray = findPrefixSumOfOddIndexedElements(array);
        System.out.println(Arrays.toString(prefixSumOfOddIndexedArray));
        int[] prefixSumOfEvenIndexedArray = findPrefixSumOfEvenIndexedElements(array);
        System.out.println(Arrays.toString(prefixSumOfEvenIndexedArray));
        for (int i = 0; i < array.length; i++) {
            int sumOfEven = 0;
            int sumOfOdd = 0;
            if (i==0){ // Handling Edge-case Scenario
                sumOfEven = prefixSumOfEvenIndexedArray[array.length-1] - prefixSumOfEvenIndexedArray[i+1];
                sumOfOdd = prefixSumOfOddIndexedArray[array.length-1] ;
            }else{
                sumOfEven = prefixSumOfEvenIndexedArray[i-1] + (prefixSumOfOddIndexedArray[array .length-1] - prefixSumOfOddIndexedArray[i]);
                sumOfOdd = prefixSumOfOddIndexedArray[i-1] + (prefixSumOfEvenIndexedArray[array.length-1] - prefixSumOfEvenIndexedArray[i]);
            }
            System.out.println(sumOfEven + " : " + sumOfOdd);
            if(sumOfEven == sumOfOdd) count++;
        }

        return count;
    }

    private static int[] findPrefixSumOfOddIndexedElements(int[] array) {
        int resultArray[] = new int[array.length];
        resultArray[0] = 0;
        for (int oddIndexPoint = 1; oddIndexPoint < array.length; oddIndexPoint++) {
            if (oddIndexPoint % 2 != 0)
                resultArray[oddIndexPoint] = resultArray[oddIndexPoint-1] + array[oddIndexPoint];
            else
                resultArray[oddIndexPoint] = resultArray[oddIndexPoint-1];
        }
        return resultArray;
    }

    private static int[] findPrefixSumOfEvenIndexedElements(int[] array) {
        int resultArray[] = new int[array.length];
        resultArray[0] = array[0];
        for (int evenIndexPoint = 1; evenIndexPoint < array.length; evenIndexPoint++) {
            if (evenIndexPoint % 2 == 0)
                resultArray[evenIndexPoint] = resultArray[evenIndexPoint-1] + array[evenIndexPoint];
            else
                resultArray[evenIndexPoint] = resultArray[evenIndexPoint-1];
        }
        return resultArray;
    }
}

/*

 */