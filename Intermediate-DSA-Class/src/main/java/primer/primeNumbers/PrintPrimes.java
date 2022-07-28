package primer.primeNumbers;

import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 2 ; i <= number ; i++) {
            if (isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeNumber(int number){
        if(number == 2) return true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
