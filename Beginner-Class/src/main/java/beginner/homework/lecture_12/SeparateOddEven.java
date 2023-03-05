package beginner.homework.lecture_12;

import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of test cases : ");
        int numberOfTestCases = sc.nextInt();
        int array[][] = new int[numberOfTestCases][];
        for(int rows = 0; rows < array.length; rows++){
            int actualSizeOfArray = sc.nextInt();
            int originalArray[] = new int[actualSizeOfArray];
            for(int i=0; i < actualSizeOfArray; i++){
                originalArray[i] = sc.nextInt();
            }
            array[rows] = originalArray;
        }
        for(int rows = 0; rows < array.length; rows++){
            for(int columns = 0; columns < array[rows].length; columns++){
                if(array[rows][columns] % 2 != 0){
                    System.out.print(array[rows][columns]+" ");
                }
            }
            System.out.println();
            for(int columns = 0; columns < array[rows].length; columns++){
                if(array[rows][columns] % 2 == 0){
                    System.out.print(array[rows][columns]+" ");
                }
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