package intermediate.lectures.lecture_21;

/**
 * Prefix Sum : Sum of all values till that point
 *          PS[i] = PS[i-1] + array[i]
 */
public class PrefixSumOfArray_2 {
    public static void main(String[] args) {
        // Input Array
        int array[] = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

        // Find Prefix Sum of ith index = 5
        /** PS[5] = PS[4] + array[5] **/

        int prefixSumArray[] = findPrefixSumOfArray(array);
        // -3 3 5 9 14 16 24 15 18 19

        int prefixSumOf_5_Index = prefixSumArray[4] + array[5];
        System.out.println("PS[5] = "+prefixSumOf_5_Index);
    }

    // TC : O(N)
    // SC : O(N)
    private static int[] findPrefixSumOfArray(int array[]){
        int prefixSumArray[] = new int[array.length];
        prefixSumArray[0] = array[0];
        for (int indexPoint = 1; indexPoint < array.length; indexPoint++) {
            /** PS[i] = PS[i-1] + array[i] **/
            prefixSumArray[indexPoint] = prefixSumArray[indexPoint-1] + array[indexPoint];
        }
        return prefixSumArray;
    }
}
