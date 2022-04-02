package beginner.arrays.twoDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArraysUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows you want : ");
        int rows = scanner.nextInt();
        int customArray[][] = new int[rows][];
        for (int i = 0; i < customArray.length; i++) {
            System.out.println("How many elements you want at "+i+" index");
            int coulmns = scanner.nextInt();
            customArray[i] = new int[coulmns];
        }
    }

    private static void print2DArrayElements(int array[][]){

        System.out.println("2-D Output using Arrays.toString()");
        for (int row = 0; row < array.length; row++) {
            System.out.print(Arrays.toString(array[row])+" ");
        }

        System.out.println("\n2-D Output using iteration");
        for (int rows = 0; rows < array.length; rows++) {
            for (int column = 0; column < array[rows].length; column++) {
                System.out.print(array[rows][column] +" ");
            }
            System.out.println();
        }

    }
}