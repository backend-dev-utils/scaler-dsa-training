package intermediate.assignment.lecture_29;

public class A_B_Modulo {
    public static void main(String[] args) {
        System.out.println(solve(5,10));
    }

    public static int solve(int A, int B) {
        return (A >= B) ? A - B: B - A;
    }
}
