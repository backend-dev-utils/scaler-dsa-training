package intermediate.lectures.lecture_22;

/**
 * Given an array, Return the length of smallest sub-array which consists both MAX & MIN element of the array.
 * Sub-Array : A continuous part of the array
 *          int array[] = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3}
 *                index => 0  1  2  3  4  5  6  7  8  9
 *           maxElement = 6, minElement = 1
 */
public class CarryForwardArray_4 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};

        int minLengthSubArrayOf_MIN_MAX = findMinMaxSubArray(array);
        System.out.println(minLengthSubArrayOf_MIN_MAX);
    }

    /**
     * Using brute force approach, found the shortest sub-array
     * which consists both MAX & MIN element of the array.
     * @param array
     * @return minimum sub-array length
     */
    private static int findMinMaxSubArray(int[] array) {
        int answer = Integer.MAX_VALUE;

        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        //Finding the minElement and maxElement
        for (int currentIndex = 0; currentIndex < array.length ; currentIndex++) {
            if (array[currentIndex] > maxElement)
                maxElement = array[currentIndex];
            else if(array[currentIndex] < minElement)
                minElement = array[currentIndex];
        }

        if(minElement == maxElement){
            return 1;
        }

        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            // Searching for maxElement
            if(array[currentIndex] == maxElement){
                for (int nextIndex = currentIndex + 1; nextIndex < array.length; nextIndex++) {
                    //
                    // Searching for nearest minElement
                    if (array[nextIndex] == minElement){
                        answer = minimumOf(answer, nextIndex - currentIndex + 1);
                        break;
                    }
                }
            }
            // Searching for minElement
            else if(array[currentIndex] == minElement){
                for (int nextIndex = currentIndex + 1; nextIndex < array.length; nextIndex++) {
                    //
                    // Searching for nearest maxElement
                    if (array[nextIndex] == maxElement){
                        answer = minimumOf(answer, nextIndex - currentIndex + 1);
                        break;
                    }
                }
            }
        }
        return answer;
    }

    /**
     * Compare both value and returns minimum of them
     * @param firstValue
     * @param secondValue
     * @return the minimum value
     */
    private static int minimumOf(int firstValue, int secondValue) {
        return firstValue < secondValue ? firstValue : secondValue;
    }
}
