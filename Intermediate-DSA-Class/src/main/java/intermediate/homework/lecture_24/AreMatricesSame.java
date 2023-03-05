package intermediate.homework.lecture_24;

import java.util.Arrays;

public class AreMatricesSame {
    public static void main(String[] args) {
        int firstArray[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int secondArray[][] = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Both Matrices are : "+matricesAreSame(firstArray, secondArray));
        System.out.println("Both Matrices are : "+areMatricesSame(firstArray, secondArray));
    }

    private static int matricesAreSame(int[][] firstArray, int[][] secondArray) {
        for (int rows = 0; rows < firstArray.length; rows++) {
            for (int columns = 0; columns < firstArray[rows].length; columns++) {
                if(firstArray[rows][columns] != secondArray[rows][columns])
                    return 0;
            }
        }
        return 1;
    }

    private static int areMatricesSame(int[][] firstArray, int[][] secondArray) {
        for (int rows = 0; rows < firstArray.length; rows++) {
            if(! Arrays.toString(firstArray[rows]).equals(Arrays.toString(secondArray[rows])))
                return 0;
        }
        return 1;
    }
}
