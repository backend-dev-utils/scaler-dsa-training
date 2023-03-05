package beginner.homework.lecture_11;

import java.util.Scanner;

public class IsFibonacci {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases =sc.nextInt();
        String[] result = new String[numberOfTestCases];
        for(int i=0; i<numberOfTestCases; i++){
            long checkNumber = sc.nextLong();
            result[i] = inFibonacciSeries(checkNumber);
        }

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    private static String inFibonacciSeries(long checkNumber) {
        int count = 0;
        long firstNumber = 0L;
        long secondNumber = 1L;
        long sum = 0L;
        System.out.println("Input : "+checkNumber);
        while(checkNumber >= sum){
            sum = firstNumber + secondNumber;
            if(sum == checkNumber){
                count += 1;
                break;
            }
            firstNumber = secondNumber;
            secondNumber = sum;
            System.out.println(sum);
        }
        System.out.println( "COUNT = "+count);
        if(count >= 1L || checkNumber == 0L) return "Yes";
        else return "No";
    }
}
