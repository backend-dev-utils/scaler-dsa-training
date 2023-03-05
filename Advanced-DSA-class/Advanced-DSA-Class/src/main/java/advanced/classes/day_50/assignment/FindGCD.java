package advanced.classes.day_50.assignment;

public class FindGCD {
    public static void main(String[] args) {
        System.out.println(new FindGCD().gcd(5,4));
    }

    public int gcd(int A, int B) {
        if(A == 0)
            return B;
        else
            return gcd(B%A, A);
    }
}
