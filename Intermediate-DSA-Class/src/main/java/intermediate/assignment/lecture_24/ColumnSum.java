package intermediate.assignment.lecture_24;

import java.util.Arrays;

public class ColumnSum {
    public static void main(String[] args) {
        int array[][] = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};

        int result[] = findColumnSum(array);

        System.out.println(Arrays.toString(result));
    }

    private static int[] findColumnSum(int[][] array) {
        int matrixColumnSum[] = new int[array[0].length];
        for (int columns = 0; columns < array[0].length; columns++) {
            int sum = 0;
            for (int rows = 0; rows < array.length; rows++) {
                sum += array[rows][columns];
            }
            matrixColumnSum[columns] = sum;
        }
        return matrixColumnSum;
    }
}
