package intermediate.assignment.lecture_21;

public class EquilibriumIndexOfArray {
    public static void main(String[] args) {
        // Input Array
        int array[] = {-7, 1, 5, 2, -4, 3, 0};
        //    indexes = 0  1  2  3   4  5  6

        int prefixSumOfArray[] = findPrefixSumOfArray(array);
        // -7, -6, -1, 1, -3, 0, 0

        int equilibriumIndex = findEquilibriumIndex(prefixSumOfArray);

        System.out.println("Equilibrium Index : " + equilibriumIndex);
    }

    private static int findEquilibriumIndex(int[] prefixSumOfArray) {
        int sumL = 0;
        int sumR = 0;
        for (int i = 0; i < prefixSumOfArray.length; i++) {
            if (i == 0) sumL = 0; // Handling Left Edge Case
            else sumL = prefixSumOfArray[i - 1];
            if (i == prefixSumOfArray.length - 1) sumR = 0; // Handling Right Edge Case
            else sumR = prefixSumOfArray[prefixSumOfArray.length - 1] - prefixSumOfArray[i];
            if (sumL == sumR) return i;
        }
        return -1;
    }

    private static int[] findPrefixSumOfArray(int[] array) {
        int prefixSumOfArray[] = new int[array.length];
        prefixSumOfArray[0] = array[0];
        for (int indexPoint = 1; indexPoint < array.length; indexPoint++) {
            prefixSumOfArray[indexPoint] = prefixSumOfArray[indexPoint - 1] + array[indexPoint];
        }
        return prefixSumOfArray;
    }
}