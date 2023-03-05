package beginner.homework.lecture_11;

import java.util.Scanner;

public class LcmOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int hcf = hcfOf(firstNumber, secondNumber);

        System.out.println((firstNumber*secondNumber)/hcf);
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
