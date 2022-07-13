package primer.strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();
        String array[] = new String[numberOfTestCases];
        for (int i = 0; i < numberOfTestCases; i++) {
            array[i] = sc.next();
        }

        for (int j = 0; j < array.length; j++) {
            System.out.println(reverseString(array[j]));
        }
    }

    private static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
