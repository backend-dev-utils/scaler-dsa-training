package beginner.arrays;

import java.util.Scanner;

public class EvenOddElements {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
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
