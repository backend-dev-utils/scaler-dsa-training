package intermediate.assignment.lecture_20;

import java.util.Scanner;

public class RotationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = scanner.nextInt();
        long array[] = new long[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextLong();
        }

        int numberOfRotation = scanner.nextInt();
        if(numberOfRotation > sizeOfArray){
            numberOfRotation = numberOfRotation % sizeOfArray;
        }
        while (numberOfRotation > 0){
            long temp = array[array.length-1];
            for (int i = array.length-1 ; i > 0; i--) {
                array[i] = array[i-1];
            }
            array[0] = temp;
            numberOfRotation--;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}

/*
Given an integer array A and an integer B, you have to print the same array after rotating it B times towards the right.
Input :
        4
        1 2 3 4
        2

Output:
        3 4 1 2

Desc  : [1,2,3,4] => [4,1,2,3] => [3,4,1,2]
*/