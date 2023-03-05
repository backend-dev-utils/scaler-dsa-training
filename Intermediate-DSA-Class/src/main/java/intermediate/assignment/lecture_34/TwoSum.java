package intermediate.assignment.lecture_34;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Kaam nahi kar rha hai ye code
 */
public class TwoSum {
    public static void main(String[] args) {
        int array[] = {2, 11, 15, 8, 1, 7};
        int target = 9;
        int output[] = findTwoSum(array, target);
        System.out.println(Arrays.toString(output));
    }

    private static int[] findTwoSum(int[] array, int target) {
        int output[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < array.length; index++) {
            if (map.containsKey(array[index])){
                map.replace(array[index], map.get(array[index]));
            }else {
                map.put(array[index], index);
            }
        }

        for (int currentValueIndex = 0; currentValueIndex < array.length; currentValueIndex++) {
            int searchElement = target - array[currentValueIndex];
            if (map.containsKey(searchElement)){

                if(output != null && (map.get(currentValueIndex) < output [0] || map.get(currentValueIndex) < output[1])
                   && map.get(searchElement) < output[0] || map.get(searchElement) < output[1])
                {
                    output[0] = Math.min(map.get(currentValueIndex), map.get(searchElement));
                    output[1] = Math.max(map.get(currentValueIndex), map.get(searchElement));
                }else{
                    output[0] = currentValueIndex + 1;
                    output[1] = map.get(target - array[currentValueIndex]) + 1;
                }
            }
        }
        return output;
    }
}
