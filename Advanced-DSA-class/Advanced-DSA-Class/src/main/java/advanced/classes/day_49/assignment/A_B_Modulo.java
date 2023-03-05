package advanced.classes.day_49.assignment;

public class A_B_Modulo {
    public static void main(String[] args) {
        System.out.println(new A_B_Modulo().solve(6816621,8157697)); //1341076
    }

    private int solve(int A, int B){
        return (A >= B) ? A - B: B - A;
    }
}

/**
 * Logic:
 *         Let's assume A > B
 *         A % M = B % M;
 *         A % M - B % M = 0;
 *         A % M - B % M + M = M;               //Adding M on both sides
 *         (A % M - B % M + M) % M = M % M;     //Taking Mode on both sides
 *         (A - B) % M = M % M;                 //Since (A - B) % M = (A % M - B % M + M) % M
 *         A - B = M;                           //Cancelling % M From both sides;
 */

/*
 * Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.
 *
 * Problem Constraints :
 * 1 <= A, B <= 109
 * A != B
 *
 * Input Format : The first argument is an integer A. The second argument is an integer B.
 * Output Format: Return an integer denoting the greatest possible positive M.
 *
 * Input : A = 1, B = 2
 * Output: 1
 * Explanation: 1 is the largest value of M such that A % M == B % M.
 *
 * Input : A = 5, B = 10
 * Output: 5
 * Explanation: For M = 5, A % M = 0 and B % M = 0. No value greater than M = 5, satisfies the condition.
 */