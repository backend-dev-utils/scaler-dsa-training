package advanced.classes.day_53.homework;

public class FindFactorial {
    public static void main(String[] args) {
        System.out.println(new FindFactorial().findFactorial(12));
    }

    private int findFactorial(int A){
        if(A <= 1)
            return 1;
        else
            return A * findFactorial(A-1);
    }
}

/*
 * Write a program to find the factorial of the given number A.
 * Problem Constraints : 0 <= A <= 12
 *
 * Input Format : First and only argument is an integer A.
 * Output Format: Return an integer denoting the factorial of the number A.
 *
 * Input : 4
 * Output: 24
 * Explanation: Factorial of 4 = 4 * 3 * 2 * 1 = 24
 *
 * Input : 1
 * Output: 1
 */