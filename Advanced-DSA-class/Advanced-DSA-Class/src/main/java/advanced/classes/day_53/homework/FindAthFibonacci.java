package advanced.classes.day_53.homework;

public class FindAthFibonacci {
    public static void main(String[] args) {
        System.out.println(new FindAthFibonacci().findAthFibonacci(9));
    }

    public int findAthFibonacci(int A) {
        if(A == 0 || A == 1)
            return A;
        else
            return findAthFibonacci(A-1) + findAthFibonacci(A-2);
    }
}

/*
 * The Fibonacci numbers are the numbers in the following integer sequence.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
 *
 * In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:
 * Fn = Fn-1 + Fn-2
 *
 * Given a number A, find and return the Ath Fibonacci Number.
 * Given that F0 = 0 and F1 = 1.
 *
 * Problem Constraints : 0 <= A <= 20
 *
 * Input : A = 2
 * Output: 1
 * Explanation: f(2) = f(1) + f(0) = 1
 *
 * Input : A = 9
 * Output: 34
 * Explanation: f(9) = f(8) + f(7) = 21 + 13  = 34
 */