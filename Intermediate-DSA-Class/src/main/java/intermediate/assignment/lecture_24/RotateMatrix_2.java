package intermediate.assignment.lecture_24;

import java.util.Arrays;

public class RotateMatrix_2 {
    public static void main(String[] args) {
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        int array[][] = {{1,2},{3,4}};
        int outputArray[][] = rotateMatrixBy90UsingAnotherMatrix(array);

        System.out.println("\nRotation for rectangular array : ");
        for (int rows = 0; rows < outputArray.length; rows++) {
            System.out.println(Arrays.toString(outputArray[rows]));
        }
    }

    /**
     * For Rectangular Matrix [It can't be done in place]
     * @param array
     * @return int[][]
     */
    private static int[][] rotateMatrixBy90UsingAnotherMatrix(int[][] array) {
        int resultantArray[][] = new int[array[0].length][array.length];
        int resultColumns = 0;
        for (int rows = 0; rows < resultantArray.length; rows++) {
            int resultRows = array.length-1;
            for (int columns = 0; columns < resultantArray[0].length; columns++) {
                resultantArray[rows][columns] = array[resultRows][resultColumns];
                resultRows--;
            }
            resultColumns++;
        }
        return resultantArray;
    }
}
