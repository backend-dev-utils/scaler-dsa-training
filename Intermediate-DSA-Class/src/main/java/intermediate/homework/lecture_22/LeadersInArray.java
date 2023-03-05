package intermediate.homework.lecture_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int array[] = {16, 17, 4, 3, 5, 2};

        int leadersArray[] = findLeaders(array);
        System.out.println(Arrays.toString(leadersArray));
    }

    private static int[] findLeaders(int[] array) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int index = array.length-1 ; index >= 0; index--) {
            if (array[index] > max){
                max = array[index];
                list.add(max);
            }
        }

        int resultArray[] = new int[list.size()];
        for (int index = 0; index < resultArray.length; index++) {
            resultArray[index] = list.get(index);
        }
        return resultArray;
    }
}
