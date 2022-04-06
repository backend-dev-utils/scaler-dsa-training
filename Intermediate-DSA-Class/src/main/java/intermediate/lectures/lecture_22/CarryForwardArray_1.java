package intermediate.lectures.lecture_22;

import java.util.Arrays;

/**
 * Given an array, Build left max array
 * Left_Max[i] = maximum value in the given array from index '0' to 'i' .
 *
 *                  array[] = [-3, 6, 2, 4, 5, 2, 8, -9]
 *                    index =>  0  1  2  3  4  5  6   7
 *                  Left_Max= [-3, 6, 6, 6, 6, 6, 8,  8]
 *
 * Note : for finding Left_Max , iterate into forward direction --->  --->  --->
 *                 |--------------------------------------------------|
 *                 | LeftMax[i] = maximumOf( LeftMax[i-1], array[i] ) |
 *                 |--------------------------------------------------|
 *
 *  ==> LeftMax[i] = 'i' aur 'i se ek pahle' wale me jo bada hai, wahi answer hai
 */
public class CarryForwardArray_1 {
    public static void main(String[] args) {
        int array[] = {-3, 6, 2, 4, 5, 2, 8, -9};
        
        int leftMaxArray[] = new int[array.length];

        leftMaxArray[0] = array[0]; // handling edge case

        for (int firstIndex = 1; firstIndex < array.length; firstIndex++) {
        /** LeftMax[i] = maximumOf( LeftMax[i-1], array[i] ) **/
            leftMaxArray[firstIndex] = max(leftMaxArray[firstIndex-1], array[firstIndex]);
        }
        // TC : O(N)    ||  SC : O(N)
        System.out.println("Left Max Array : "+Arrays.toString(leftMaxArray));
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}