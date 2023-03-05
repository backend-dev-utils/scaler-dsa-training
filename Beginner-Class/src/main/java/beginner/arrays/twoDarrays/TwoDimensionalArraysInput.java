package beginner.arrays.twoDarrays;

import java.util.Arrays;

public class TwoDimensionalArraysInput {
    public static void main(String[] args) {
        int array[][] = {{10,20,30},{4,5,6,7},{80,90}};
        print2DArrayElements(array);
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
