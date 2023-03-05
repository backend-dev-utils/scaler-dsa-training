package beginner.arrays.twoDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No of rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter No of columns : ");
        int columns = scanner.nextInt();
        int count = 1;

        int array[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) { // Go to every element of ith row
            for (int j = 0; j < columns; j++) {
                array[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
