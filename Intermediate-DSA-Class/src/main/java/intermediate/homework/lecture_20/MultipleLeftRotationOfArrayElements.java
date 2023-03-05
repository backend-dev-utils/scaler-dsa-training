package intermediate.homework.lecture_20;

import java.util.Arrays;

public class MultipleLeftRotationOfArrayElements {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int noOfRotation[] = {0,2,3,484,6};

        int result[][] = solve(array, noOfRotation);

        for (int rows = 0; rows < result.length; rows++) {
            System.out.println(Arrays.toString(result[rows]));
        }
    }

    private static int[][] solve(int[] array, int[] noOfRotation) {
        int resultArray[][] = new int[noOfRotation.length][array.length];
        for (int rows = 0; rows < resultArray.length; rows++) {
            for (int columns = 0; columns < resultArray[rows].length; columns++) {
                resultArray[rows][columns] = array[columns];
            }
        }
        for (int rows = 0; rows < resultArray.length; rows++) {
            resultArray[rows] = leftRotateArray(resultArray[rows], noOfRotation[rows]);
        }
        return resultArray;
    }

    private static int[] leftRotateArray(int[] array, int numberOfRotation) {
        if(numberOfRotation > array.length){
            numberOfRotation = numberOfRotation % array.length;
        }
        while (numberOfRotation > 0){
            int temp = array[0];
            for (int i = 0 ; i < array.length-1; i++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = temp;
            numberOfRotation--;
        }
        return array;
    }
}

/*
Input :
        A = [1, 2, 3, 4, 5]
        B = [2, 3]

Output: [ [3, 4, 5, 1, 2] , [4, 5, 1, 2, 3] ]

Desc :
       B[0] = 2 which requires 2 times left rotations

        1: [2, 3, 4, 5, 1]

        2: [3, 4, 5, 1, 2]

       B[1] = 3 which requires 3 times left rotation

        1: [2, 3, 4, 5, 1]

        2: [3, 4, 5, 1, 2]

        3: [4, 5, 1, 2, 3]
*/