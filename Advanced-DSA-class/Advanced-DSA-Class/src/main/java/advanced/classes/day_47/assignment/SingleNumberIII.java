package advanced.classes.day_47.assignment;

import java.util.Arrays;

public class SingleNumberIII {
    public static void main(String[] args) {
        int array[] = {6,5,8,7,7,8,8,5,2,5,6,6,7};

        int frequencyArray[] = new int[32];
        for (int x : array){
            int freqIndex = 0;
            while(x > 0){
                int lastBit = (x&1);
                if(lastBit == 1){
                    frequencyArray[freqIndex]++; // value at this index is incremented by 1.
                }
                freqIndex++;
                x = x>>1;
            }
        }

        int p = 1;
        int answer = 0;
        for (int x : frequencyArray){
            answer = answer + (x%3) * p;
            p = p<<1;
        }
        System.out.println(answer);
    }
}

/*
 * Input : [6,5,8,7,7,8,8,5,2,5,6,6,7]
 * Output: 2
 *
 * Description : 2 occurs exactly once in Input.
 */