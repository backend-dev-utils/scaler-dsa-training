package intermediate.assignment.lecture_31;

import java.util.Arrays;

public class ArithmeticProgression {
    public static void main(String[] args) {
        int array[] = {3, 5, 1};
        System.out.println(isArithmeticArray(array));
    }

    private static int isArithmeticArray(int[] A) {
        if(A == null || A.length == 0 || A.length == 1)
            return 0;

        Arrays.sort(A);
        int difference = A[1] - A[0];
        for(int index = 1; index < A.length; index++){
            if(A[index] - A[index - 1] != difference)
                return 0;
        }
        return 1;
    }
}
