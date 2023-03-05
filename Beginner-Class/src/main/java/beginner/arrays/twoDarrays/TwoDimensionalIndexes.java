package beginner.arrays.twoDarrays;

import java.util.Scanner;

public class TwoDimensionalIndexes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("No of rows : ");
        int rows = scanner.nextInt();
        System.out.println("No of columns : ");
        int columns = scanner.nextInt();

        int array[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(i+","+j+" ");
            }
            System.out.println();
        }
    }
}
