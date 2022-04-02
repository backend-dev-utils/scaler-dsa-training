package beginner.homework.lecture_10;

import java.math.BigInteger;

public class CalculateGCD {
    public static void main(String[] args) {

//        System.out.println(gcd(4,6));
        System.out.println(bigIntegerGcd(2,4,8));
    }

    public static int gcd(int A, int B) {
        int quotient;
        int divider;
        quotient = A>B ? A : B;
        divider = A>B ? B : A;
        int result = 1;
        while (divider > 0){
            int temp = divider;
            divider = quotient % divider;
            if(divider == 0) result = temp;
            quotient = temp;
        }
        return result;
    }

    public static BigInteger bigIntegerGcd(int A, int B, int C) {
        BigInteger a = new BigInteger(String.valueOf(A));
        BigInteger b = new BigInteger(String.valueOf(B));
        BigInteger c = new BigInteger(String.valueOf(C));
        return a.gcd(b).gcd(c);
    }
}
