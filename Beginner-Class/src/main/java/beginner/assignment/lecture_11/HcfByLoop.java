package beginner.assignment.lecture_11;

import java.util.Scanner;

public class HcfByLoop {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int numberOfLoop = sc.nextInt();
        int[] result = new int[numberOfLoop];
        for(int i=0; i<numberOfLoop; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            result[i] = hcfOf(a,b);
        }

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    private static int hcfOf(int a, int b){
        int quotient, divider;

        quotient = a > b ? a : b ;
        divider = a > b ? b : a ;
        int remainder = 1;
        while(remainder > 0){
            remainder = quotient % divider;
            quotient = divider;
            if(remainder > 0){
                divider = remainder;
            }else{
                divider = quotient;
            }
        }
        return divider;
    }
}