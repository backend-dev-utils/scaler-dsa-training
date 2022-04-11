package intermediate.assignment.lecture_22;

public class ClosestMinMax {
    public static void main(String[] args) {
        int array[] = {343, 291, 963, 165, 152};

        int minMaxLength = findClosestMinMaxSubArray(array);
        System.out.println(minMaxLength);
    }

    private static int findClosestMinMaxSubArray(int[] array) {
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        int maxElementIndex = 0;
        int minElementIndex = 0;
        for (int index = 0; index < array.length; index++) {
            if(array[index] <= minElement){
                minElement = array[index];
                if(maxElementIndex <= index)
                    minElementIndex = index;
            }
            if(array[index] >= maxElement){
                maxElement = array[index];
                if(minElementIndex <= index)
                    maxElementIndex = index;
            }
        }
        return Math.abs(maxElementIndex-minElementIndex) + 1;
    }
}
