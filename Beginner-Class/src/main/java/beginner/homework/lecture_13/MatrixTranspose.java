package beginner.homework.lecture_13;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int A[][] = {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        int result[][] = solve(A);
        
        for (int rows = 0; rows < result.length; rows++) {
            System.out.println(Arrays.toString(result[rows]));
        }
    }

    private static int[][] solve(int[][] A) {
        int result[][] = new int[A[0].length][A.length];
        for (int columns = 0; columns < A[0].length; columns++) {
            for (int rows = 0; rows < A.length; rows++) {
                result[columns][rows] = A[rows][columns];
            }
        }
        return result;
    }
}

/*
    Input :
    A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]

    Output :
        [[1, 4, 7],[2, 5, 8],[3, 6, 9]]
 */