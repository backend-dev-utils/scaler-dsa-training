package advanced.classes.day_44.rough_work;

public class PrintSumOfAllSubArrays {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int prefixSumArray[] = new int[array.length];
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
            prefixSumArray[index] = sum;
        }
//        [1, 3, 6, 10, 15]
    }
}