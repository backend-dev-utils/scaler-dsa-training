package intermediate.assignment.lecture_26;

public class SingleNumber {
    public static void main(String[] args) {
        int array[] = {1, 2, 2, 3, 1};

        int singleOccurrenceElement = findSingleNumber(array);
        System.out.println(singleOccurrenceElement);
    }

    private static int findSingleNumber(int[] array) {
        int singleOccurrenceNumber = 0;
        for (int index = 0; index < array.length; index++) {
            singleOccurrenceNumber ^= array[index];
        }
        return singleOccurrenceNumber;
    }
}
