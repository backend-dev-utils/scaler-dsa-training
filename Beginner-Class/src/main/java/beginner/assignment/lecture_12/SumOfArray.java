package beginner.assignment.lecture_12;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] array = new int[sizeOfArray];
        int sum = 0;
        for(int i=0; i<sizeOfArray; i++){
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}

/*
Input : A single line representing N followed by N integers of the array A
        4 10 50 40 80

Ouput : 180
*/