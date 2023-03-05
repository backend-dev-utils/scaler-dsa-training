package intermediate.assignment.lecture_20;

import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,1};
        array = solve(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static int[] solve(int[] A) {
        int temp;
        for (int i = 0, j = A.length-1; i < j; i++, j--) {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }
}
/*
Input :
        A = [1,2,3,2,1]
        B = [1,1,10]
Output:
        A = [1,2,3,2,1]
        B = [10,1,1]
 */