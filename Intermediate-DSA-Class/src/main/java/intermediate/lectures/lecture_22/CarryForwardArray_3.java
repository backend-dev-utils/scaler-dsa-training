package intermediate.lectures.lecture_22;

/**
 * Given a string of lowercase characters, return the count of pairs of (i, j) such that
 *               i < j
 *            s[i] = 'a'
 *            s[j] = 'g'
 *
 *      String[] str = [ a, b, e, g, a, g ]
 *             index =>  0  1  2  3  4  5
 *             pairs = (0,3), (0,5), (4,5)
 */
public class CarryForwardArray_3 {
    public static void main(String[] args) {
        // Input (converted String into character array)
        char[] array = {'a', 'b', 'e', 'g', 'a', 'g'};

        // Brute force approach [TC : O(N^2), SC : O(1)]
        int totalPairsCount = findCountUsingBruteForce(array);
        System.out.println(totalPairsCount);

        totalPairsCount = findCountUsingOptimizedSolution(array);
        System.out.println(totalPairsCount);
    }

    /**
     * Optimized solution : [TC : O(N), SC : O(1)]
     * @param array
     * @return
     */
    private static int findCountUsingOptimizedSolution(char[] array) {
        int count_A = 0;
        int countOfPair_AG = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 'a') count_A ++;
            else if (array[i] == 'g') countOfPair_AG += count_A;
        }
        return countOfPair_AG;
    }

    /**
     * Brute Force Solution : [TC : O(N^2), SC : O(1)]
     * @param array
     * @return
     */
    private static int findCountUsingBruteForce(char array[]){
        int pairCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == 'a' && array[j] == 'g')
                    pairCount++;
            }
        }
        return pairCount;
    }
}
