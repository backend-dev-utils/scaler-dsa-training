package advanced.classes.day_44.assignment;

public class MaxSumContiguousSubArray {
    public static void main(String[] args) {
        int array[] = {-1000, -1000, -1000, -1000};

        MaxSumContiguousSubArray value = new MaxSumContiguousSubArray();
        System.out.println(value.maxSubArray(array));
    }

    public int maxSubArray(final int[] array) {
        int length = array.length;
        int maximumSum = Integer.MIN_VALUE;
        for (int subArrayLength = 1; subArrayLength <= length; subArrayLength++) {
            int maxSumOfSubArray = createSubArray(array, subArrayLength);
            maximumSum = maxSumOfSubArray > maximumSum ? maxSumOfSubArray : maximumSum;
        }
        return maximumSum;
    }

    private int createSubArray(int array[], int lengthOfArray){
        int startIndex = 0;
        int lastIndex = startIndex + lengthOfArray;
        int max = Integer.MIN_VALUE;
        while (lastIndex <= array.length){
            int result[] = new int[lengthOfArray];
            int resultArrayIndex = 0;// Always starts from 0th index
            for (int arrayIndex = startIndex; arrayIndex < lastIndex; arrayIndex++, resultArrayIndex++) {
                result[resultArrayIndex] = array[arrayIndex];
            }
            int sum = getSum(result);
            max = sum > max ? sum : max;
            startIndex++; // moving one step forward
            lastIndex++; // moving one step forward till last index of array
        }
        return max;
    }

    private int getSum(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}


/**
 * Cheated from Discussion Tab
 *
 * int ans = Integer.MIN_VALUE;
 * int sum = 0;
 * for(int i=0; i<A.length; i++){
 * sum += A[i];
 * ans = Math.max(ans, sum);
 * if(sum < 0)
 * sum = 0;
 * }
 * return ans;
 */