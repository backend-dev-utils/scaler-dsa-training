package advanced.classes.day_47.homework;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(new ReverseBits().reverse(3));
    }

    public long reverse(long A) {

        long result = 0;

        for (int i = 0; i < 32; i++) {
            // 1. get ith bit is 0 or 1 and ith bit will be at last
            // final result will be like 00001 or 00000
            // 2. will shift last bit to correct position
            // 3. will add bit in result with OR
            result = result | (((A >> i) & 1) << (31 - i));
        }

        return result;
    }
}
