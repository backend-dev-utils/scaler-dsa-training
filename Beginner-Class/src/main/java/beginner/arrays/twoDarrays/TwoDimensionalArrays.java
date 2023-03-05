package beginner.arrays.twoDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("No of rows : ");
        int rows = scanner.nextInt();
        System.out.println("No of columns : ");
        int columns = scanner.nextInt();

        int array[][] = new int[rows][columns];
        int count = 1;

        System.out.println("Data inserted horizontally :\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = count;
                count++;
            }
        }
        printArray(array);

        System.out.println("\nData inserted vertically :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[j][i] = count;
                count++;
            }
        }
        printArray(array);
    }

    private static void printArray(int[][] array) {
        for (int rows = 0; rows < array.length; rows++) {
            System.out.println(Arrays.toString(array[rows]));
        }
    }
}
