package intermediate.lectures.lecture_21;

public class PrefixSumOfArray_1 {
    public static void main(String[] args) {
        // Input Array
        int array[] = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

        // Find Prefix Sum of this Array
        // Prefix Sum : Sum of all values till that point

        int prefixSumArray[] = new int[array.length];
        int sum = 0;
        for (int indexPoint = 0; indexPoint < array.length; indexPoint++) {
            sum = sum + array[indexPoint];
            prefixSumArray[indexPoint] = sum;
        }

        for (int prefixSumIndex = 0; prefixSumIndex < prefixSumArray.length; prefixSumIndex++) {
            System.out.print(prefixSumArray[prefixSumIndex] + " ");
        }
    }
}