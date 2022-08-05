package advanced.classes.day_53.assignment;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(new SumOfDigits().findSum(46));
    }

    private int findSum(int A) {
        if (A < 10)
            return A;
        else
            return A%10 + findSum(A/10);
    }
}
