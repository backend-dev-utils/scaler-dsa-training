package intermediate.lectures.lecture_21;

import java.util.Arrays;

/**
 * Given an array & Q queries :
 * array    = {2, 3, 1, -1, 0, 8, 5, 4};
 * index    => 0  1  2   3  4  5  6  7
 *
 * S_O      : Sum of all odd indexed elements in [s, e].
 *            0th index is not included.
 *
 * S_E      : Sum of all even indexed elements in [s, e].
 *            0th index is included.
 *
 * Question :       s       e       Sum of Odd/Even indexed element
 *                  3       7       S_O (sum of all odd indexed element from index_3 to index_7)
 *                  1       5       S_E (sum of all even indexed element from index_1 to index_5)
 *
 * Desc     :
 *              S_O = array[3] + array[5] + array[7] => -1 + 8 + 4 = 11
 *              S_E = array[2] + array[4] => 1 + 0 = 1
 * ----------------------------------------------------------------------------------------------
 * Prefix sum of all even/odd indexed elements :
 * PS_even  : Sum of all even index elements till now
 * PS_odd  : Sum of all odd index elements till now
 *
 *          array   :   {2, 3, 1, -1, 0, 8, 5, 4}
 *               index   0  1  2   3  4  5  6  7
 *          PS_odd  :   {0, 3, 3, 2, 2, 10,10,14}:: summed only odd indexed elements
 *          PS_even :   {2, 2, 3, 3, 3, 3, 8, 8} :: summed only even indexed elements
 *
 * So we can use PS_odd for finding sum of all odd indexed elements in range [s, e]:
 *          PS_odd[s, e] = PS_odd[e] - PS_odd[s-1]
 *       => PS_odd[3, 7] = PS_odd[7] - PS_odd[3-1] = 14 - 3 = 11
 *
 * Same as we can use PS_even for finding sum of all even indexed elements in range [s, e]:
 *          PS_even[s, e] = PS_even[e] - PS_even[s-1]
 *       => PS_even[1, 5] = PS_even[5] - PS_even[1-1] = 3 - 2 = 1
 *
 * ----------------------------------------------------------------------------------------------
 */
public class PrefixSumOf_Odd_Even_IndexedElementsOfArray {
    public static void main(String[] args) {
        int oddArray[] = {2, 3, 1, -1, 0, 8, 5, 4};
        int prefixSumOfOddIndexedElements[] = findPrefixSumOfOddIndexedElements(oddArray);
        System.out.println("Prefix Sum of Odd indexed elements : "+Arrays.toString(prefixSumOfOddIndexedElements));
        System.out.println("Sum of all odd elements in range [3, 7] : "+(prefixSumOfOddIndexedElements[7] - prefixSumOfOddIndexedElements[3-1]));
        int evenArray[] = {2, 3, 1, -1, 0, 8, 5, 4};
        int prefixSumOfEvenIndexedElements[] = findPrefixSumOfEvenIndexedElements(evenArray);
        System.out.println("Prefix Sum of Even indexed elements : "+Arrays.toString(prefixSumOfEvenIndexedElements));
        System.out.println("Sum of all even elements in range [1, 5] : "+(prefixSumOfEvenIndexedElements[5] - prefixSumOfEvenIndexedElements[1-1]));
    }

    private static int[] findPrefixSumOfOddIndexedElements(int[] array) {
        int resultArray[] = new int[array.length];
        array[0] = 0;
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