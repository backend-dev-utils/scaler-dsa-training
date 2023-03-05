package intermediate.assignment.lecture_31;

import java.util.Arrays;

public class SortByColor {
    public static void main(String[] args) {
        int array[] = {0, 1, 2, 0, 1, 2};
        array = findSortedArrayByColor(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] findSortedArrayByColor(int[] array) {
        int resultantArray[] = new int[array.length];
        int redColorCount = 0, whiteColorCount = 0, blueColorCount = 0;
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            if (array[currentIndex] == 0)
                redColorCount++;
            else if(array[currentIndex] == 1)
                whiteColorCount++;
            else if (array[currentIndex] == 2)
                blueColorCount++;
        }
        for (int index = 0; index < redColorCount ; index++) {
            resultantArray[index] = 0;
        }
        for (int index = redColorCount ; index < redColorCount+whiteColorCount; index++) {
            resultantArray[index] = 1;
        }
        for (int index = redColorCount+whiteColorCount ; index < redColorCount+whiteColorCount+blueColorCount; index++) {
            resultantArray[index] = 2;
        }
        return resultantArray;
    }
}
