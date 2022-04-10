package intermediate.assignment.lecture_21;

public class CountWaysOddEvenIndexedElementSumBecomeEqual_3 {
    public static void main(String[] args) {
        int array[] = {2, 1, 6, 4};
        System.out.println(solve(array));
    }

    private static int solve(int[] A) {
        // building psEven
        int[] psEven = new int[A.length];
        int n = A.length;
        psEven[0] = A[0];
        for (int i=1; i<n; i++) {
            if (i%2 == 0) {
                psEven[i] = psEven[i-1] + A[i];
            }
            else {
                psEven[i] = psEven[i-1];
            }
        }

        // building psOdd
        int[] psOdd = new int[A.length];
        psOdd[0] = 0;
        for (int i=1; i<n; i++) {
            if (i%2 == 1) {
                psOdd[i] = psOdd[i-1] + A[i];
            }
            else {
                psOdd[i] = psOdd[i-1];
            }
        }
        int sumEven = 0, sumOdd = 0, count = 0, tempSumEvenLeft = 0, tempSumOddLeft = 0;

        for (int i=0; i<n; i++) {

            if (i == 0) {
                tempSumEvenLeft = 0;
                tempSumOddLeft = 0;
            }
            else {
                tempSumEvenLeft = psEven[i-1];
                tempSumOddLeft = psOdd[i-1];
            }

            sumEven = tempSumEvenLeft + psOdd[n-1] - psOdd[i];
            sumOdd = tempSumOddLeft + psEven[n-1] - psEven[i];

            if (sumEven == sumOdd) {
                count++;
            }
        }

        return count;
    }
}
