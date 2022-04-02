package intermediate.homework.lecture_17;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverseNumber = 0;
        for (int i = 1; i <= number; i++) {
            reverseNumber = checkArmstrongProperty(i);
            if (i == reverseNumber) {
                System.out.println(i);
            }
        }
    }

    private static int checkArmstrongProperty(int number) {
        int remainder = 1;
        int totalSum = 0;
        while(number > 0){
            remainder = number % 10;
            totalSum += remainder*remainder*remainder;
            number /= 10;
        }
        return totalSum;
    }
}
