package intermediate.assignment.lecture_32;

import java.util.Arrays;

public class ToUpper {
    public static void main(String[] args) {
        char array[] = {'S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        array = toUpper(array);
        System.out.println(Arrays.toString(array));
    }

    private static char[] toUpper(char[] array) {
        for (int index = 0; index < array.length; index++) {
            if (Character.isLowerCase(array[index]))
                array[index] = Character.toUpperCase(array[index]);
        }
        return array;
    }
}
