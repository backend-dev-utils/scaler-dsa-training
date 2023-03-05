package primer.introduction_to_function;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println(solve(4));
    }

    public static int solve(int A){
        return (int) Math.ceil(3.14 * A * A);
    }
}
