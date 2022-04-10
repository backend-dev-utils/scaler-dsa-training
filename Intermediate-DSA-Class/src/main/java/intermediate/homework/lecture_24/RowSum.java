package intermediate.homework.lecture_24;

import java.util.Arrays;

public class RowSum {
    public static void main(String[] args) {
        int array[][] = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};

        int result[] = findRowSum(array);

        System.out.println(Arrays.toString(result));
    }

    private static int[] findRowSum(int[][] array) {
        int matrixColumnSum[] = new int[array.length];
        for (int rows = 0; rows < array.length; rows++){
            int sum = 0;
            for (int columns = 0; columns < array[0].length; columns++) {
                sum += array[rows][columns];
            }
            matrixColumnSum[rows] = sum;
        }
        return matrixColumnSum;
    }
}
