package intermediate.homework.lecture_23;

public class CountingSubArrays {
    public static void main(String[] args) {
        int array[] = {2, 5, 6};
        int sum = 10;

        int result = countSubArrays(array, sum);
        System.out.println(result);
    }

    private static int countSubArrays(int[] array, int sum) {
        int countOfSubArrays = 0;
        int lengthOfArray = array.length;
        int prefixSumArray[] = new int[array.length];
        prefixSumArray[0] = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < sum)
                countOfSubArrays++;
            if (index > 0)
            prefixSumArray[index] = prefixSumArray[index-1] + array[index];
        }
//      [2,7,13]
        int numberOfElement = 2;

        while(numberOfElement < lengthOfArray){
            for (int currentIndex = 0; currentIndex < lengthOfArray; currentIndex += numberOfElement) {
                
            }
            numberOfElement++;
        }

        return countOfSubArrays;
    }
}

/**
    Description : Given an array A of N non-negative numbers and a non-negative number B,
                  you need to find the number of sub-arrays in A with a sum less than B.
                  We may assume that there is no overflow.

    Input Format: First argument is an integer array A.
                  Second argument is an integer B.

    Output Format: Return an integer denoting the number of sub-arrays in A having sum less than B.

    Input : A = [2, 5, 6],  B = 10          A = [1, 11, 2, 3, 15], B = 10
    Output: 4                               4

    Hint  : The sub-arrays with sum is      The sub-arrays with sum is less
            less than B are {2}, {5},       than B are {1}, {2}, {3} and {2, 3}.
            {6} and {2, 5},
**/