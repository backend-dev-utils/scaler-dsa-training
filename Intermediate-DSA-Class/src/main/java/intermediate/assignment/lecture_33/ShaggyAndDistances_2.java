package intermediate.assignment.lecture_33;

import java.util.HashMap;
import java.util.Map;

public class ShaggyAndDistances_2 {
    public static void main(String[] args) {
        int array[] = {1,1};
        int minimumPossibleDistance = new ShaggyAndDistances_2().findMinimumPossibleDistanceBetweenSpecialPair(array);
        System.out.println(minimumPossibleDistance);
    }

    private int findMinimumPossibleDistanceBetweenSpecialPair(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int minimumPossibleDistance = Integer.MAX_VALUE;
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            if(map.containsKey(array[currentIndex])){
                map.replace(array[currentIndex], currentIndex - map.get(array[currentIndex]));
                minimumPossibleDistance = Math.min(minimumPossibleDistance , map.get(array[currentIndex]));
            }
            else{
                map.put(array[currentIndex] , currentIndex);
            }
        }
        return minimumPossibleDistance == Integer.MAX_VALUE ? -1 : minimumPossibleDistance;
    }
}
