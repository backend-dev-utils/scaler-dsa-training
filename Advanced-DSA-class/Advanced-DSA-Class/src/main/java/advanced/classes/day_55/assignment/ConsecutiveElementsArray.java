package advanced.classes.day_55.assignment;

import java.util.Arrays;

public class ConsecutiveElementsArray {
    public static void main(String[] args) {
        System.out.println(new int[]{3, 2, 1, 4, 5});
    }

    public int checkConsecutiveArray(int[] A) {
        Arrays.sort(A);
        int number = A[0];
        for(int i=0; i<A.length; i++){
            if(A[i] != number)
                return 0; // If elements are not consecutive, return 0.
            number++;
        }
        return 1; // If all elements are consecutive, return 1.
    }
}
