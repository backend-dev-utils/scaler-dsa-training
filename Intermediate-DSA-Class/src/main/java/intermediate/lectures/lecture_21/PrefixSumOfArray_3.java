package intermediate.lectures.lecture_21;

/**
 * Prefix Sum : Sum of all values till that point
 *         PS[i] = PS[i-1] + array[i]
 *
 * Question : What is the sum of all element with indices in the range of [s, e].
 *                                               s : start index, e : end index.
 * Hint     : Sum[s, e] = PS[e] - PS[s-1]
 */
public class PrefixSumOfArray_3 {
    public static void main(String[] args) {

        // Input Array
        int array[] = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

        //Step: 1 [Find Prefix Sum of the array]
        int prefixSumArray[] = findPrefixSumOfArray(array);
        // -3 3 5 9 14 16 24 15 18 19
        /** 0 1 2 3 4  5  6  7  8  9 => indices **/

        /** Let's find Sum[s, e], assume start index = 3 and end index = 7 **/
        // Sum[3,7] = PS[7] - PS[3-1]
        int sum = prefixSumArray[7] - prefixSumArray[3-1];
        System.out.println("Sum[3,7] : "+ sum);
    }

    //  TC : O(N)
    //  SC : O(N)
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