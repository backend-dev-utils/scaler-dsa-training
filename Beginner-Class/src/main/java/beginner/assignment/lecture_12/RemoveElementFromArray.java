package beginner.assignment.lecture_12;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int array[] = new int[sizeOfArray];
        for(int i=0; i<sizeOfArray; i++){
            array[i] = sc.nextInt();
        }

        int removeIndexElement = sc.nextInt();

        int resultArray[] = removeElementFromArray(array, removeIndexElement-1);

        for(int i =0 ; i<resultArray.length; i++){
            System.out.print(resultArray[i] + (i<resultArray.length-1 ? " " : ""));
        }
    }

    private static int[] removeElementFromArray(int[] array, int removeIndexElement) {
        int resultArray[] = new int[array.length-1];
        for(int i = 0; i<resultArray.length; i++){
            if(i < removeIndexElement){
                resultArray[i] = array[i];
            }else if(i >= removeIndexElement){
                resultArray[i] = array[i+1];
            }
        }
        return resultArray;
    }
}

/*
Input : First line is N which means number of elements.
        Second line contains N space separated integers.
        Third line is X position which has to be deleted.

        5
        2 3 1 4 2
        3

Output : 2 3 4 2
 */