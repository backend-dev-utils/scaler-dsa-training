package intermediate.homework.lecture_20;

import java.util.Arrays;
import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        int[][] array = new int[numberOfTestCases][];
        for (int rows = 0; rows < array.length; rows++) {
            int sizeOfArray = scanner.nextInt();
            array[rows] = new int[sizeOfArray];
            for (int columns = 0; columns < array[rows].length; columns++) {
                array[rows][columns] = scanner.nextInt();
            }
        }

        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                if(array[rows][columns] % 2 != 0)
                    System.out.print(array[rows][columns]+" ");
            }
            System.out.println();
            for (int columns = 0; columns < array[rows].length; columns++) {
                if(array[rows][columns] % 2 == 0)
                    System.out.print(array[rows][columns]+" ");
            }
            System.out.println();
        }
    }
}

/*
Input :
        2
        5
        1 2 3 4 5
        3
        4 3 2

Output:
        1 3 5
        2 4
        3
        4 2
*/
