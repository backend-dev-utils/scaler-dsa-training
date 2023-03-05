package beginner.assignment.lecture_12;

import java.util.Scanner;

public class MinMaxElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int array[] = new int[sizeOfArray];
        for(int i = 0; i<sizeOfArray; i++){
            array[i] = sc.nextInt();
        }

        int maxNumberOfArray = Integer.MIN_VALUE;
        int minNumberOfArray = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxNumberOfArray) maxNumberOfArray = array[i];
            if(array[i] < minNumberOfArray) minNumberOfArray = array[i];
        }

        System.out.println(maxNumberOfArray+" "+minNumberOfArray);
    }
}
