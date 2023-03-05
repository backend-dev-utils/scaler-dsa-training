package advanced.classes.day_53.assignment;

/**
 * Cheated from discussion tab
 */
public class PowerFunctionImpl {
    public static void main(String[] args) {
        System.out.println(new PowerFunctionImpl().pow(2,3,3));
    }

    public int pow(int A, int B, int C) {
        if(A == 0) return 0;
        if (B == 0) return 1;

        long p = (long)pow(A, B/2, C);
        if(B % 2 == 0) {
            return (int)((p%C * p%C)+C) % C;
        }else{
            return (int)((A%C * p%C * p%C)+C) % C;
        }
    }
}

