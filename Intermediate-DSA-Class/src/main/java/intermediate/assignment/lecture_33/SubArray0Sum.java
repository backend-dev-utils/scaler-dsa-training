package intermediate.assignment.lecture_33;

import java.util.HashSet;

public class SubArray0Sum {
    public static void main(String[] args) {
        System.out.println(new SubArray0Sum().findArraySum(new int[]{1, 2, 3, 4, 5}));
    }

    private int findArraySum(int arr[]){
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                return 1;
            }
            set.add(sum);
        }
        return (set.size() == arr.length) ? 0 : 1;
    }
}

/**
 *  0 : Sub-Array sum is not 0
 *  1 : Sub-Array sum is 0
 */