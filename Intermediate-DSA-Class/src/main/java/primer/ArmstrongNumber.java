package primer;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            int result = 0;
            int checkNumber = i;
            while (checkNumber != 0){
                int remainder = checkNumber % 10;
                result = result + (remainder * remainder * remainder);
                checkNumber = checkNumber / 10;
            }
            if(result == i){
                System.out.println(i);
            }
        }
    }
}
