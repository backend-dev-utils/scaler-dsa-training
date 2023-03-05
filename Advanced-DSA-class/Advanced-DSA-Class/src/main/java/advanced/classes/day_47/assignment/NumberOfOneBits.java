package advanced.classes.day_47.assignment;

import java.util.Arrays;

/**
 * Count how many 1-bits are present in binary representation of given number.
 */
public class NumberOfOneBits {
    public static void main(String[] args) {
        NumberOfOneBits numberOfOneBits = new NumberOfOneBits();
        System.out.println(numberOfOneBits.numSetBits(4567));
    }

    public int numSetBits(int A) {
        int array[] = new int[32];
        int index = array.length-1;
        while(A != 0){
            array[index] = A % 2; // inserting values from last index because of remainders
            A = A/2;
            index--;
        }

        System.out.println(Arrays.toString(array));

        int bitCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 1)
                bitCount++;
        }
        return bitCount;
    }
}

/*
 * Input : 4567
 * Output: 8
 *
 * Description : 4567 is represented as [1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1].
 *               and total no of 1-bits are 8.
 */