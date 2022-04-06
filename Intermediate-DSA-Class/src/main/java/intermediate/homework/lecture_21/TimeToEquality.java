package intermediate.homework.lecture_21;

/**
 * Given an integer array A of size N. In one second, you can increase the value of one element by 1.
 * Find the minimum time in seconds to make all elements of the array equal.
 */
public class TimeToEquality {
    public static void main(String[] args) {
        int array[] = {2, 4, 1, 3, 2};
        int maxTime = findMaxTimeToEquality(array);
        System.out.println(maxTime);
    }

    private static int findMaxTimeToEquality(int[] array) {
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxElement)
                maxElement = array[i];
        }
        int maxRequiredTime = 0;
        for (int i = 0; i < array.length; i++) {
            maxRequiredTime = maxRequiredTime + (maxElement - array[i]);
        }
        return maxRequiredTime;
    }
}

/*
    Input   : A = [2, 4, 1, 3, 2]
    Output  : 8
    Desc    : We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
*/