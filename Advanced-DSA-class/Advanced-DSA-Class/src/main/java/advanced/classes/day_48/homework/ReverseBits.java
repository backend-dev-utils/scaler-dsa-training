package advanced.classes.day_48.homework;

import java.util.Arrays;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(new ReverseBits().reverse(3));
    }

    public long reverse(long A) {
        int array[] = new int[32];
        int index = 0;

        while(A > 0 || index <= array.length-1){
            int lastBit = (int) (A % 2);
            if(lastBit == 0){
                array[index] = 1;
            }else if(lastBit == 1){
                array[index] = 0;
            }
//            array[index] = lastBit;
            index++;
            A = A >> 1;
        }

        System.out.println(Arrays.toString(array));

        long result = 0;
        long p = 1;
        for (int i = array.length-1; i >= 0; i--) {
            result = result + array[i] * p;
            p = p << 1;
        }

        return result;
    }
}
