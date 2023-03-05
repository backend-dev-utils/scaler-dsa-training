package intermediate.assignment.lecture_34;

import java.util.HashMap;
import java.util.Map;

/**
 * Revise it again
 */
public class DiffK_II {
    public static void main(String[] args) {
        int array[] = {0};
        int k = 0;

        int result = findOutput(array, k);
        System.out.println(result);
    }

    private static int findOutput(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < array.length; index++) {
            //Handle edge case also
            if (map.containsKey(array[index] + k) || map.containsKey(array[index] - k)){
                return 1;
            }else {
                map.put(array[index], index);
            }
        }
        return 0;
    }
}
