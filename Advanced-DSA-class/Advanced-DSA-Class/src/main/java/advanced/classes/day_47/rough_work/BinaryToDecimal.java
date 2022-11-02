package advanced.classes.day_47.rough_work;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int array[] = new int[input.length()];
        for(int i=0; i<input.length(); i++){
            array[i] = input.charAt(i) == '1' ? 1 : 0;
        }

        System.out.println(Arrays.toString(array));
        long result = 0;
        int power = 1;
        for (int i = array.length-1; i >= 0; i--) {
            result = result + (array[i] * power);
            power = power << 1;
        }
        System.out.println(result);
    }
}
