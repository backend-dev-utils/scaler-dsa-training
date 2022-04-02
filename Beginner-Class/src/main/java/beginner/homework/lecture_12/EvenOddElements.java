package beginner.homework.lecture_12;

import java.util.Scanner;

public class EvenOddElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        int result[] = new int[numberOfTestCases];

        for(int i=0; i<numberOfTestCases; i++){
            int arraySize = sc.nextInt();
            int array[] = new int[arraySize];
            for(int j = 0; j<arraySize; j++){
                array[j] = sc.nextInt();
            }
            result[i] = findDefference(array);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int findDefference(int[] array) {
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i<array.length; i++){
            if(isEven(array[i])){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        return absoluteDifference(evenCount,oddCount);
    }

    private static boolean isEven(int number){
        if(number % 2 == 0) return true;
        else return false;
    }

    private static int absoluteDifference(int evenCount, int oddCount){
        int difference = evenCount - oddCount;

        if(difference >= 0) return difference;
        else return difference * -1;
    }
}

/*
Input : You are given T(number of test cases) integer arrays. For each array A,
        you have to find the value of absolute difference between
        the counts of even and odd elements in the array.

1
4 1 2 3 4

1
4 2 3 5 1

1
1 4

 */