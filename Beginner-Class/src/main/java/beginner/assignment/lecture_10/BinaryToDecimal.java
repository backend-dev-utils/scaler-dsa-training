package beginner.assignment.lecture_10;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//1011,11
        long binaryInput = sc.nextLong();
        System.out.println(decimalNumber(binaryInput));
    }

    private static long decimalNumber(long binaryInput){
        long remainder = 0;
        long quotient = 1;
        long power = 0;
        long total = 0;
        while(quotient>0){
            remainder = binaryInput%10;
            quotient = binaryInput/10;
            total = total + powerOfNumber(power) * remainder;
            power++;
            binaryInput = quotient;
        }
        return total;
    }

    private static long powerOfNumber(long power) {
        if (power == 0) return 1;
        else {
            long sum = 1;
            for(int i=0; i<power; i++) sum = sum * 2;

            return sum;
        }
    }
}