package intermediate.homework.lecture_24;

import java.util.Arrays;

public class RowToColumnZero {
    public static void main(String[] args) {
        int array[][] = {{1,2,3,4},{5,6,7,0},{9,2,0,4}};

        int outputArray[][] = convertRowToColumnZero(array);
        for (int rows = 0; rows < outputArray.length; rows++) {
            System.out.println(Arrays.toString(outputArray[rows]));
        }
    }

    private static int[][] convertRowToColumnZero(int[][] array) {
        int countOfZero = 0;
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                if (array[rows][columns] == 0)
                {
                    countOfZero++;
                }
            }
        }
        int zeroRowPosition[] = new int[countOfZero], zeroColumnPosition[] = new int[countOfZero];

        int index = 0;
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                if (array[rows][columns] == 0)
                {
                    zeroRowPosition[index] = rows;
                    zeroColumnPosition[index] = columns;
                    index++;
                }
            }
        }

        for (int zeroIndex = 0; zeroIndex < zeroRowPosition.length; zeroIndex++) {
            for (int rows = 0; rows < array.length; rows++) {
                for (int columns = 0; columns < array[rows].length; columns++) {
                    if(rows == zeroRowPosition[zeroIndex]){
                        array[rows][columns] = 0;
                    }
                    if(columns == zeroColumnPosition[zeroIndex]){
                        array[rows][columns] = 0;
                    }
                }
            }
        }
        return array;
    }
}

/*
Input :
        [1,2,3,4]
        [5,6,7,0]
        [9,2,0,4]
Explanation : A[2][2] = A[1][3] = 0,
              so make 2nd row, 2nd column, 1st row and 3rd column all elements zero.

Output :
        [1,2,0,0]
        [0,0,0,0]
        [0,0,0,0]
*/