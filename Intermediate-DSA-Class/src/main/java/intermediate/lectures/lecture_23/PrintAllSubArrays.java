package intermediate.lectures.lecture_23;

import java.util.Arrays;

public class PrintAllSubArrays {
    public static void main(String[] args) {
        int array[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Print all length of Sub - Arrays
        for (int subArrayLength = 1; subArrayLength <= array.length; subArrayLength++) {
            int subArrayOfLength[][] = printSubArrayOfLength(array, subArrayLength);
        }
    }

    private static int[][] printSubArrayOfLength(int[] array, int subArrayLength) {
        int outputArray[][] = new int[array.length - subArrayLength + 1][subArrayLength];
        for (int i = 0; i < array.length - subArrayLength + 1; i++) {
                int subArray[] = new int[subArrayLength];
            for (int j = 0; j < i; j ++) {
                subArray[j] = array[i];
//                outputArray[i] = subArray;
            }
                System.out.println(Arrays.toString(subArray));
        }
        return outputArray;
    }
}
