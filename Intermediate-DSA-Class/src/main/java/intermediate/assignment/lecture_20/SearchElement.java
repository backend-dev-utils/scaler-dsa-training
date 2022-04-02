package intermediate.assignment.lecture_20;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfTestCases = scanner.nextInt();
        int resultArray[] = new int[noOfTestCases];
        int array[];
        for (int i = 0; i < noOfTestCases; i++) {
            int totalElements = scanner.nextInt();
            array = new int[totalElements];

            for (int j = 0; j < totalElements; j++) {
                array[j] = scanner.nextInt();
            }
            int keyElement = scanner.nextInt();
            resultArray[i] = searchElementInArray(array, keyElement);
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }
    }

    private static int searchElementInArray(int[] array, int keyElement) {
        for (int i = 0, j = array.length-1; i < (array.length/2) + 1; i++, j--) {
            if(array[i] == keyElement || array[j] == keyElement){
                return 1;
            }
        }
        return 0;
    }
}

/*
You are given an integer T (number of test cases). You are given array A and an integer B for each test case.
You have to tell whether B is present in array A or not.
Input :
        1
        15    4 1 6 8 12 83 43 2 7 9 3 0 5 9 1
        5
Output:
        1
*/