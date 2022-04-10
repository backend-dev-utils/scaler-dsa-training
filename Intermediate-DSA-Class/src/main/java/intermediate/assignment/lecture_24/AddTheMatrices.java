package intermediate.assignment.lecture_24;

import java.util.Arrays;

public class AddTheMatrices {
    public static void main(String[] args) {
        int firstArray[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int secondArray[][] = {{9,8,7},{6,5,4},{3,2,1}};

        int resultArray[][] = matrixAddition(firstArray, secondArray);

        for (int rows = 0; rows < resultArray.length; rows++) {
            System.out.println(Arrays.toString(resultArray[rows]));
        }
    }

    private static int[][] matrixAddition(int[][] firstArray, int[][] secondArray) {
        int matrixAddition[][] = new int[firstArray.length][firstArray[0].length];
        for (int rows = 0; rows < firstArray.length; rows++) {
            for (int columns = 0; columns < firstArray[rows].length; columns++) {
                matrixAddition[rows][columns] = firstArray[rows][columns] + secondArray[rows][columns];
            }
        }
        return matrixAddition;
    }

}
