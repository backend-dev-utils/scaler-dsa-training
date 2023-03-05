package intermediate.assignment.lecture_23;

import java.util.Arrays;

public class MaximumSumContiguousSubArray {
    public static void main(String[] args) {
        int array[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maximumSum = findMaxSubArray(array);
        Arrays.sort(array);
        System.out.println("Maximum Sum of Sub Array : "+maximumSum);
    }

    private static int findMaxSubArray(int[] array) {

        int prefixSum[] = new int[array.length];
        prefixSum[0] = array[0];
        for (int index = 1; index < array.length-1 ; index++) {
            prefixSum[index] = prefixSum[index - 1] + array[index];
        }

        for (int subArray = 0; subArray < array.length-1; subArray++) {
            for (int index = subArray; index < array.length - 1 ; index++) {

            }
        }

        System.out.println(Arrays.toString(prefixSum));
        return 0;
    }

    private static int maximum(int firstValue, int secondValue){
        return firstValue > secondValue ? firstValue : secondValue ;
    }
}