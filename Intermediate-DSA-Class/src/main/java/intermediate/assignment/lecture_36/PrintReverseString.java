package intermediate.assignment.lecture_36;

import java.util.Scanner;

public class PrintReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        System.out.println(new PrintReverseString().printReverseString(input, input.length()));
    }

    private String printReverseString(String input, int length) {
        if(length < 1) return input;
        return printReverseString(input.substring(input.length() - 1, length), length - 2);
    }
}
