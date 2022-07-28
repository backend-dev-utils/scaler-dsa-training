package advanced.classes.day_48.assignment;

import java.util.Arrays;

public class CountTotalSetBits {
    public static void main(String[] args) {
        int number = 1000000000;

        System.out.println(new CountTotalSetBits().totalSetBits(number));
    }

    private int totalSetBits(int number) {
        int sum = 0;
        for (int i = 1; i <= number ; i++){
            int value = i;
            while(value > 0){
                int lastBit = (value&1);
                if (lastBit == 1)
                    sum++;
                value = value >> 1;
            }
        }

        return sum % 1000000007;
    }
}
