package advanced.classes.day_47.homework;

import java.util.Arrays;

public class MinXORvalue {
    public static void main(String[] args) {
        int array[] = {0, 2, 7, 5};
        System.out.println(new MinXORvalue().findMinXor(array));
    }


    public int findMinXor(int[] A) {
        Arrays.sort(A);
        int minXOR = Integer.MAX_VALUE;
        for (int i = 0; i < A.length-1; i++) {
            int xor = A[i+1] ^ A[i];
            if(xor < minXOR)
                minXOR = xor;
        }
        return minXOR;
    }
}
