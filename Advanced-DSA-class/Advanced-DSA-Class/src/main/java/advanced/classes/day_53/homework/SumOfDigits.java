package advanced.classes.day_53.homework;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(new SumOfDigits().findSumOfDigits(46));
    }

    public int findSumOfDigits(int A) {
        if(A < 10)
            return A;
        else
            return A%10 + findSumOfDigits(A/10);
    }
}
/*
 * Given a number A, we need to find the sum of its digits using recursion.
 *
 * Problem Constraints : 1 <= A <= 109
 *
 * Input Format : The first and only argument is an integer A.
 * Output Format: Return an integer denoting the sum of digits of the number A.
 *
 * Input : 46
 * Output: 10
 * Explanation : Sum of digits of 46 = 4 + 6 = 10
 *
 * Input : 11
 * Output: 2
 * Explanation : Sum of digits of 11 = 1 + 1 = 2
 */