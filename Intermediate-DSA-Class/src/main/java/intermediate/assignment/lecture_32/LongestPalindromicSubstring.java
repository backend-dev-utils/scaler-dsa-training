package intermediate.assignment.lecture_32;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String input = "abb";
        //bbcccbb
        input = new LongestPalindromicSubstring().findLongestPalindrome(input);
        System.out.println(input);
    }

    private String findLongestPalindrome(String A) {
        char array[] = A.toCharArray();
        int startIndex = 0, lastIndex = 0, answer = 0 ;

        for (int currentIndex = 0; currentIndex < array.length ; currentIndex++) {
            // Taking A[currentIndex] as centre.
            int length = expand(array, currentIndex, currentIndex);
            if (length > answer) {
                startIndex = currentIndex - length/2 ;
                lastIndex = startIndex + length;
            }
            answer = maximumOf(answer, length);

        }

        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++) {
            // Taking A[currentIndex], A[currentIndex + 1] as center.
            int length = expand(array, currentIndex, currentIndex + 1);
            if (length > answer) {
                startIndex = currentIndex - length/2 + 1;
                lastIndex = startIndex + length ;
            }
            answer = maximumOf(answer, length);
        }
        return A.substring(startIndex, lastIndex);
    }


    /**
     * Return maximum after two values
     * @param firstValue
     * @param secondValue
     * @return
     */
    private int maximumOf(int firstValue, int secondValue) {
        return firstValue > secondValue ? firstValue : secondValue ;
    }


    /**
     * Maximum Expansion of array from left-index to right-index.
     * @param array
     * @param leftIndex
     * @param rightIndex
     * @return
     */
    private int expand(char[] array, int leftIndex, int rightIndex) {
        while(leftIndex >= 0 && rightIndex < array.length){
            if(array[leftIndex] == array[rightIndex]){
                leftIndex--; rightIndex++;
            }else
                return rightIndex - leftIndex - 1;
        }
        return rightIndex - leftIndex - 1;
    }
}
