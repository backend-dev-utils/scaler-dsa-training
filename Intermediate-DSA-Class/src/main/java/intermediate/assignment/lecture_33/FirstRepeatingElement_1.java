package intermediate.assignment.lecture_33;

/**
 * Brute Force Solution
 * TC : O(N^2), SC : O(1)
 */
public class FirstRepeatingElement_1 {
    public static void main(String[] args) {
        int array[] = {10, 5, 3, 4, 3, 5, 6};
        int firstRepeatingElement = findFirstRepeatingElement(array);
        System.out.println(firstRepeatingElement);
    }

    private static int findFirstRepeatingElement(int[] array) {
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            for (int nextIndex = currentIndex + 1; nextIndex < array.length; nextIndex++) {
                if(array[currentIndex] == array[nextIndex]){
                    return array[currentIndex];
                }
            }
        }
        return -1;
    }
}
