package intermediate.assignment.lecture_33;

import java.util.HashMap;
import java.util.Map;

/**
 * Brute Force Solution
 * TC:O(^2), SC:O(N)
 */
public class ShaggyAndDistances {
    public static void main(String[] args) {
        int array[] = {7, 1, 3, 4, 5, 6};
        int minimumPossibleDistance = new ShaggyAndDistances().findMinimumPossibleDistanceBetweenSpecialPair(array);
        System.out.println(minimumPossibleDistance);
    }

    private int findMinimumPossibleDistanceBetweenSpecialPair(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < array.length; index++) {
            int distance = 0;
            for (int nextIndex = index + 1; nextIndex < array.length; nextIndex++) {
                if (array[index] == array[nextIndex]){
                    distance = nextIndex - index;
                    map.put(array[index], distance);
                    break;
                }
            }
        }

        int minimumPossibleDistance = Integer.MAX_VALUE;

        if (map.isEmpty()) {
            return -1;
        }
        else{
            for (Integer value : map.keySet()) {
                if (map.get(value) < minimumPossibleDistance)
                    minimumPossibleDistance = map.get(value);
            }
        }
        return minimumPossibleDistance > 0 ? minimumPossibleDistance : -1;
    }
}
