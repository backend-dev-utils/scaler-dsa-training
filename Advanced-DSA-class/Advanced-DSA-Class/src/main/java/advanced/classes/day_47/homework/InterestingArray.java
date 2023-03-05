package advanced.classes.day_47.homework;

public class InterestingArray {
    public static void main(String[] args) {
        int array[] = {9,17};

        System.out.println(new InterestingArray().solve(array));
    }

    private String solve(int[] array) {
        int oddElementCount = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 != 0) {
                oddElementCount++;
            }
        }

        return oddElementCount % 2 == 0 ? "Yes" : "No";
    }
}
