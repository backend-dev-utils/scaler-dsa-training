package primers;

public class PowersOf2 {

    public int power(String A) {

        String dividend = A;
        StringBuilder str;

        if (A == null || A.length() == 0)
            return 0;

        if (A.length() == 1 && A.charAt(0) == '0')
            return 0;

        while (dividend.length() > 0 && !dividend.equalsIgnoreCase("2")) {
            str = new StringBuilder();
            int carry = 0;
            int n = dividend.length();

            if (n > 0) {
                int num = dividend.charAt(n - 1) - '0';

                if (num % 2 == 1)
                    return 0;
            }

            for (int i = 0; i < n; i++) {

                char c = (char) (dividend.charAt(i) - '0');
                int res = c + 10 * carry;

                c = (char) (res / 2 + '0');
                carry = res % 2;

                str.append(c);
            }

            if (str.charAt(0) == '0')
                str.deleteCharAt(0);

            dividend = str.toString();
        }

        return 1;

    }

}

/*

Approach O(1)

public static boolean isPowerOfTwo(long n)
  {
    return (n != 0) && ((n & (n - 1)) == 0);
  }


static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
        if ((n & (~(n - 1))) == n)
            return true;
        return false;
    }


static boolean isPowerOfTwo (int x)
    {
        return x!=0 && ((x&(x-1)) == 0);
     }


 static boolean isPowerOfTwo(int n)
    {
        int cnt = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                cnt++; // if n&1 == 1 keep incrementing cnt
                // variable
            }
            n = n >> 1; // keep dividing n by 2 using right
                        // shift operator
        }
        if (cnt == 1) {
            // if cnt = 1 only then it is power of 2
            return true;
        }
        return false;
    }

 */
