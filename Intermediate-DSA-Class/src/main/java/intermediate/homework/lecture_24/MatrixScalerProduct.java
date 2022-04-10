package intermediate.homework.lecture_24;

import java.util.Arrays;

public class MatrixScalerProduct {
    public static void main(String[] args) {
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int multiplicationNumber = 2;

        int scalerProduct[][] = scalerProductOfMatrix(array, multiplicationNumber);

        for (int rows = 0; rows < scalerProduct.length; rows++) {
            System.out.println(Arrays.toString(scalerProduct[rows]));
        }
    }

    private static int[][] scalerProductOfMatrix(int[][] array, int multiplicationNumber) {
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                array[rows][columns] = array[rows][columns] * multiplicationNumber;
            }
        }
        return array;
    }
}
