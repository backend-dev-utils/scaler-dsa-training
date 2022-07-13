package primer;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int array[] = new int[length];
        for(int i = 0; i < length; i++){
            int number = sc.nextInt();
            array[i] = reverseNumber(number);
        }

        for(int i = 0; i < length; i++){
            System.out.println(array[i]);
        }
    }

    private static int reverseNumber(int number){
        int result = 0;
        while(number != 0){
            int remainder = number % 10;
            result = (result * 10) + remainder;
            number = number / 10;
        }
        return result;
    }
}
