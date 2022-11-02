package advanced.classes.day_63.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShaggyAndDistances {
    public static void main(String[] args) {
        int array[] = {7, 1, 3, 4, 1, 1, 7};
        int output = findMinimumDistinctElementDistance(array);
        System.out.println(output);
    }

    private static int findMinimumDistinctElementDistance(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> distanceList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){
                distanceList.add(Math.abs(map.get(array[i]) - i));
            }else {
                map.put(array[i], i);
            }
        }
        int minimumValue = Integer.MAX_VALUE;
        for (Integer value : distanceList){
            if (value < minimumValue)
                minimumValue = value;
        }
        return minimumValue == Integer.MAX_VALUE ? -1 : minimumValue;
    }

}
/**
 * Shaggy has an array A consisting of N elements.
 * We call a pair of distinct indices in that array a special
 * if elements at those indices in the array are equal.
 *
 * Shaggy wants you to find a special pair such that
 * the distance between that pair is minimum.
 * Distance between two indices is defined as |i-j|.
 * If there is no special pair in the array, then return -1.
 */

/*
 */