package intermediate.lectures.lecture_22;

import java.util.Arrays;

/**
 * Given an array, Build right max array
 * Right_Max[i] = maximum value in the given array from index [i, N-1]
 *
 *                  array[] =  [-3,    6,    2,    4,    5,    2,    -9]
 *                    index =>   0     1     2     3     4     5      6
 *                 Right_Max = [ 6 <-- 6 <-- 5 <-- 5 <-- 5 <-- 2 <-- -9]
 *
 * Note : for finding Right_Max , iterate into backward direction <---  <---  <--- from last index.
 *               |------------------------------------------------------|
 *               | Right_Max[i] = maximumOf( Right_Max[i+1], array[i] ) |
 *               |------------------------------------------------------|
 *       Due to backward direction iteration, we are taking : Right_Max[i+1]
 *
 * ==> RightMax[i] = 'i+1' aur 'i se ek pahle' wale me jo bada hai, wahi answer hai !!!
 */
public class CarryForwardArray_2 {
    public static void main(String[] args) {
        int array[] =  {-3, 6, 2, 4, 5, 2, -9};

        int rightMaxArray[] = new int[array.length];
        rightMaxArray[array.length-1] = array[array.length-1];
        for (int lastIndex = array.length-2; lastIndex >= 0; lastIndex--) {
            rightMaxArray[lastIndex] = max( rightMaxArray[lastIndex+1] , array[lastIndex] );
        }
        System.out.println(Arrays.toString(rightMaxArray));
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}