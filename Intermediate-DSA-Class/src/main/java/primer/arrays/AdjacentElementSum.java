package primer.arrays;

public class AdjacentElementSum {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int result = findMinCount(array);
        System.out.println(result);
    }

    private static int findMinCount(int[] A) {
        int oddCount = 0, evenCount = 0;
        for(int i=0; i<A.length; i++){
            if(A[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        return oddCount <= evenCount ? oddCount : evenCount;
    }
}

/**
    Question : Sum of adjacent elements is always even
               Given an array of integers A, find and return the minimum elements to be removed such that
               in the resulting array the sum of any two adjacent values is even.

    Input Format   : The only argument given is the integer array A.
    Output Format  : Return the minimum number of elements to be removed.

    Example :

    Input 1:   A = [1, 2, 3, 4, 5]
    Output 1:  2

    Input 2:   A = [5, 17, 100, 11]
    Output 2:  1
*/
