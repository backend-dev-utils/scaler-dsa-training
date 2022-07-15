package advanced.classes.day_44.assignment.rough_work;

import java.util.Arrays;

/**
 * Sub Array : A contiguous part of array is called as sub-array.
 *
 * Array : {1, 2, 3, 4, -10}
 * Sub-arrays   : List of sub-arrays            : count
 * Length 1     : {1} , {2}, {3}, {4}, {-10}    : 5
 * Length 2     : {1,2}, {2,3}, {3,4}, {4,-10}  : 4
 * Length 3     : {1,2,3}, {2,3,4}, {3,4,-10}   : 3
 * Length 4     : {1,2,3,4}, {2,3,4,-10}        : 2
 * Length 5     : {1,2,3,4,-10}                 : 1
 *
 * Total count of sub-arrays from an array : 5+4+3+2+1
 *      Formula : n(n+1) / 2
 */

public class PrintAllSubArrays {
    public static void main(String[] args) {
        int array[] = {1, 2, 3};
        int length = array.length;

        for (int subArrayLength = 1; subArrayLength <= length; subArrayLength++) {
            createSubArray(array, subArrayLength);
        }
    }

    /**
     * Sliding Window Technique
     * @param array
     * @param lengthOfArray
     */
    private static void createSubArray(int array[], int lengthOfArray){
        int startIndex = 0;
        int lastIndex = startIndex + lengthOfArray;

        while (lastIndex <= array.length){
            int result[] = new int[lengthOfArray];
            int resultArrayIndex = 0;// Always starts from 0th index
            for (int arrayIndex = startIndex; arrayIndex < lastIndex; arrayIndex++, resultArrayIndex++) {
                result[resultArrayIndex] = array[arrayIndex];
            }
            print(result);
            startIndex++; // moving one step forward
            lastIndex++; // moving one step forward till last index of array
        }
    }

    private static void print(int array[]){
        System.out.println(Arrays.toString(array));
    }
}
