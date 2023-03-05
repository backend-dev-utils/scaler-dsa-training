package intermediate.assignment.lecture_32;

public class IsAlphaNumeric {
    public static void main(String[] args) {
        char array[] = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0', '@'};

        int isAplhaNumeric = isAplNum(array);
        System.out.println(isAplhaNumeric);
    }

    private static int isAplNum(char[] array) {
        for (int index = 0; index < array.length; index++) {
            if(!Character.isAlphabetic(array[index]) && !Character.isDigit(array[index]))
                return 0;
        }
        return 1;
    }
}
