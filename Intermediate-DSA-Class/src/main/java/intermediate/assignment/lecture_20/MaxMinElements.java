package intermediate.assignment.lecture_20;

import java.util.Scanner;

public class MaxMinElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = scanner.nextInt();
        int array[] = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }

        int maxInteger = Integer.MIN_VALUE;
        int minInteger = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (maxInteger <= array[i]) {
                maxInteger = array[i];
            }
            if (minInteger >= array[i]) {
                minInteger = array[i];
            }
        }

        System.out.println(maxInteger +" "+minInteger);
    }
}
