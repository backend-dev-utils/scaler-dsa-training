package advanced.classes.day_53.homework;

public class AnotherSequenceProblem {
    public static void main(String[] args) {
        System.out.println(new AnotherSequenceProblem().findNextSequence(3));
    }

    public int findNextSequence(int A) {
        if(A < 2) return 1;
        if(A == 2) return A;
        else return findNextSequence(A-1) + findNextSequence(A-2) + findNextSequence(A-3) + A;
    }
}


/*
 * Given a sequence f(A) = f(A-1) + f(A-2) + f(A-3) + A .
 * Calculate the Ath term of the sequence.
 * Given f(0)=1; f(1)=1; f(2)=2;
 *
 * Problem Constraints : 0<=n<=20
 *
 * Input : 3
 * Output: 7
 * Explanation : f(3) = 2+1+1+3 = 7
 *
 * Input : 2
 * Output: 2
 * Explanation : f(2) = 2
 */