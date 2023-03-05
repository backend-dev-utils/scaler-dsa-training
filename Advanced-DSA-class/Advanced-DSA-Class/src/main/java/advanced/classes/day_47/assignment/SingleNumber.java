package advanced.classes.day_47.assignment;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{1, 2, 2, 3, 1}));
    }

    public int singleNumber(final int[] A) {
        int x = A[0];
        for(int i = 1; i < A.length; i++){
            x ^= A[i];  // Using xor operator to find unique value
        }
        return x ;
    }
}
