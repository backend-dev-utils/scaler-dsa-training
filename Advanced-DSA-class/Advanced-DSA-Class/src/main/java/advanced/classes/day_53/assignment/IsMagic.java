package advanced.classes.day_53.assignment;

public class IsMagic {
    public static void main(String[] args) {
        System.out.println(new IsMagic().solve(83557));
    }

    private int solve(int A) {

        while (A >= 10){
            A = findSumOfDigits(A);
        }

        if (A == 1)
            return 1;
        else
            return 0;
    }

    private int findSumOfDigits(int A) {
        if (A < 10)
            return A;
        else
            return A%10 + findSumOfDigits(A/10);
    }
}
