package primer.primeNumbers;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isPrimeNumber(number))
            System.out.println("YES");
        else
            System.out.println("NO");
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
