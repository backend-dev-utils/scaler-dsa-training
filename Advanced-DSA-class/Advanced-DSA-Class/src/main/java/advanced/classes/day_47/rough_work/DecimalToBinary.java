package advanced.classes.day_47.rough_work;

import java.util.Arrays;

/**
 * Converting a number from decimal to Binary
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        long number = 25;
        int binaryNumber[] = new int[32];
        int index = binaryNumber.length - 1;
        while(number != 0){
            binaryNumber[index] = (int) number % 2;
            number = number / 2;
            index--;
        }
        System.out.println(Arrays.toString(binaryNumber));
    }
}
