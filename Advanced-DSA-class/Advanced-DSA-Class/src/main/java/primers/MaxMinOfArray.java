package primers;

import java.util.Scanner;

public class MaxMinOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int array[] = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(max + " " + min);
    }
}
