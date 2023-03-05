package beginner.assignment.lecture_13;

import java.util.Arrays;

public class MatrixSubtraction {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},{4,5,6},{7,8,9}};//{{-6,-5,0}};//
        int B[][] = {{9,8,7},{6,5,4},{3,2,1}};//{{3,8,7}};//
        int result[][] = solve(A,B);
        for (int rows = 0; rows < result.length; rows++) {
            System.out.println(Arrays.toString(result[rows]));
        }
    }

    private static int[][] solve(int[][] A, int[][] B) {
        int result[][] = new int[A.length][];
        for (int rows = 0; rows < A.length; rows++) {
            result[rows] = A[rows];
            for (int column = 0; column < A[rows].length; column++) {
                result[rows][column] = A[rows][column] - B[rows][column];
            }
        }
        return result;
    }
}

/*
Input:
A = [[1, 2, 3],            B = [[9, 8, 7],
      [4, 5, 6],                 [6, 5, 4],
      [7, 8, 9]]                 [3, 2, 1]]

Output:
[[-8, -6, -4], [-2, 0, 2], [4, 6, 8]]
 */