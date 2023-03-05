package advanced.classes.day_56.assignment;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        String output = new LargestNumber().largestNumber(new int[]{9,30,2,0});
        System.out.println(output);
    }

    public String largestNumber(final int[] A) {
        int rotationTime = A.length;
        long largestNumber = Long.MIN_VALUE;
        while(rotationTime > 0){
            int array[] = rotateArray(A);
            long number  = checkNumber(array);
            if (number > largestNumber)
                largestNumber = number;
            rotationTime--;
        }
        return String.valueOf(largestNumber);
    }

    private int[] rotateArray(int[] array) {
        int firstNumber = array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = firstNumber;
//        System.out.println(Arrays.toString(array));
        return array;
    }

    private long checkNumber(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        return Long.valueOf(sb.toString());
    }
}

/**
 * Rotate Array :
 * 0 :                 9, 3, 2, 0
 * 1 :                             -> 3, 2, 0, 9
 * 2 :                                          -> 2, 0, 9, 3
 * 3 :                                                         -> 0, 9, 3, 2
 *
 *
 *
 *
 */