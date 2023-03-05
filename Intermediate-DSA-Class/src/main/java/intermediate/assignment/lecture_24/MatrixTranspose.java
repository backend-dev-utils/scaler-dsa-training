package intermediate.assignment.lecture_24;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};

        array = transposeMatrix(array);

        for (int rows = 0; rows < array.length; rows++) {
            System.out.println(Arrays.toString(array[rows]));
        }
    }

    private static int[][] transposeMatrix(int[][] array) {
        int transposedArray[][] = new int[array[0].length][array.length];
        for (int rows = 0; rows < transposedArray.length; rows++) {
            for (int columns = 0; columns < transposedArray[rows].length; columns++) {
                transposedArray[rows][columns] = array[columns][rows];
            }
        }
        return transposedArray;
    }
}
