package advanced.classes.day_48.assignment;

import java.util.Arrays;

public class CountTotalSetBits {
    public static void main(String[] args) {
        int number = 1000000000;

        System.out.println(new CountTotalSetBits().totalSetBits(number));
    }

    private int totalSetBits(int number) {
        int sum = 0;
        for (int i = 1; i <= number ; i++){
            int value = i;
            while(value > 0){
                int lastBit = (value&1);
                if (lastBit == 1)
                    sum++;
                value = value >> 1;
            }
        }

        return sum % 1000000007;
    }
}

/*
 *
 *
        public int solve(int A) {
        long mod = 1000000007l;
        long count = 0l;
        long num = (long)A;
        for(int i=30; i>0; i--){
            if(((num>>i)&1)==0){
            continue;
        }
        long leastBitContribution = (i*(1l<<(i-1)))%mod;
        count = (count + leastBitContribution) %mod; // 2^i
        num = ((1<<(long)i)^num); // number unseting current bit
        long currentBitContribution = num + 1;
        count = (count + currentBitContribution) %mod;
        }
        if((num&1)==1){
        count++;
        }
        return (int)(count%mod);
        }

 *
 */

/*

public int solve(int A) {

        int MOD = 1000000007;
        int totalSetBits = 0;
        int msb = getFirstSetBitIndex(A); //find out leftmost set bit index.

        for(int i=msb ; i>=0 ; i--) {
            int pow = (int) Math.pow(2, i);
            int slots = (A +1) / pow;
            if((A+1) % pow != 0) {
                if(slots % 2 != 0) {
                    totalSetBits = (totalSetBits + ((A+1) % pow)) % MOD;
                }
            }
            totalSetBits = (totalSetBits + ((slots / 2) * pow) % MOD) % MOD;
        }

        return totalSetBits;
    }

    private int getFirstSetBitIndex(int A) {

        for(int i=30 ; i>=0 ; i--) {

            if(((1 << i) & A) > 0) {
                return i;
            }
        }
        return -1;
    }

 */