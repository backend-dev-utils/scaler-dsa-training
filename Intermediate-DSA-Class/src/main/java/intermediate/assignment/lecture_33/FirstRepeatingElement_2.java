package intermediate.assignment.lecture_33;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingElement_2 {
    public static void main(String[] args) {
        int array[] = {10, 5, 3, 4, 3, 5, 6};
        int firstRepeatingElement = findFirstRepeatingElement(array);
        System.out.println(firstRepeatingElement);
    }

    private static int findFirstRepeatingElement(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>(); // Linked Hash Map preserves insertion order
        for (int index = 0; index < array.length; index++) {
            if (map.containsKey(array[index])){
                map.replace(array[index], map.get(array[index])+ 1);
            } else{
                map.put(array[index], 1);
            }
        }
        for(Integer key : map.keySet()){
            if (map.get(key) > 1)
                return key;
        }
        return -1;
    }
}
