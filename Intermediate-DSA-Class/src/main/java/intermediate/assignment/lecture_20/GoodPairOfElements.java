package intermediate.assignment.lecture_20;

public class GoodPairOfElements {
    public static void main(String[] args) {
        int array[] = {1,2,3,4};
        int sumValue = 7;

        System.out.println(solve(array, sumValue));
    }

    private static int solve(int[] array, int sumValue) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == sumValue) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
