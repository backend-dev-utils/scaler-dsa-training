package intermediate.assignment.lecture_24;

import java.util.Arrays;

public class RotateMatrix_1 {
    public static void main(String[] args) {
//    int array[][] = {{1,2},{3,4}};
//    int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
      int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        rotateMatrixBy90Degree(array);

        for (int rows = 0; rows < array.length; rows++) {
            System.out.println(Arrays.toString(array[rows]));
        }
    }

    /**
     * Rotate 90-degree clockwise square matrix
     * Need to do it in place [cannot create another matrix]
     * @param array
     * Hint : Find the pattern from matrix-transpose
     * => Step - 1 : Transpose the matrix
     * => Step - 2 : Swap the columns of the matrix : Reverse the matrix
     */
    private static int[][] rotateMatrixBy90InPlace(int[][] array) {
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = rows; columns < array[rows].length; columns++) {
                int temp = array[rows][columns];
                array[rows][columns] = array[columns][rows];
                array[columns][rows] = temp;
            }
        }

        for (int rows = 0; rows < array.length; rows++) {
            int lastColumn = array[rows].length - 1;
            for (int columns = 0; columns < array[rows].length/2; columns++) {
                int temp = array[rows][columns];
                array[rows][columns]= array[rows][lastColumn-columns];
                array[rows][lastColumn-columns] = temp;
            }
        }
        return array;
    }

    /**
     * Practice on it !!!
     * @param array
     */
    private static void rotateMatrixBy90Degree(int array[][]){
        int n = array.length;
        for (int i = 0; i < (n + 1) / 2; i ++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = array[n - 1 - j][i];
                array[n - 1 - j][i] = array[n - 1 - i][n - j - 1];
                array[n - 1 - i][n - j - 1] = array[j][n - 1 -i];
                array[j][n - 1 - i] = array[i][j];
                array[i][j] = temp;
            }
        }
    }
}

/*
Input   :
            [1, 2, 3]
            [4, 5, 6]
            [7, 8, 9]

Output  :
            [7, 4, 1]
            [8, 5, 2]
            [9, 6, 3]
*/