package beginner.assignment.lecture_12;

import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int array[] = new int[sizeOfArray];
        for(int i=0; i<sizeOfArray; i++){
            array[i] = sc.nextInt();
        }

        int indexOfNewElement = sc.nextInt();
        int newElemment = sc.nextInt();

        int resultArray[] = addNewElement(array, indexOfNewElement, newElemment);

        for(int i=0; i<resultArray.length; i++){
            System.out.print(resultArray[i]+(i<resultArray.length-1 ? " ":""));
        }
    }

    private static int[] addNewElement(int[] array, int indexOfNewElement, int newElemment){
        int resultArray[] = new int[array.length + 1];
        for(int i = 0; i<resultArray.length; i++){
            if(i < indexOfNewElement){
                resultArray[i] = array[i];
            }else if(i == indexOfNewElement){
                resultArray[i] = newElemment;
            }else{
                resultArray[i] = array[i-1];
            }
        }
        return resultArray;
    }
}

/*
Input : First line is N which means number of elements.
        Second line contains N space separated integers.
        Third line is X position where Y has to be inserted.
        Fourth line is Y which has to be inserted.

        5
        2 3 1 4 2
        3
        5

Output : 2 3 1 5 4 2
*/