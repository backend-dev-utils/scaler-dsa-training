package intermediate.assignment.lecture_17;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        int array[] = new int[numberOfTestCases];
        for (int i = 0; i < numberOfTestCases; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                System.out.println(oddPerfectCheck(array[i]));
            }else{
                System.out.println(evenPerfectCheck(array[i]));
            }
        }
    }

    private static String oddPerfectCheck(int number) {
        int sum = 0;
        for (int i = 1; i <= number/2; i += 2) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) return "YES";
        else return "NO";
    }

    private static String evenPerfectCheck(int number) {
        int sum = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) return "YES";
        else return "NO";
    }
}
