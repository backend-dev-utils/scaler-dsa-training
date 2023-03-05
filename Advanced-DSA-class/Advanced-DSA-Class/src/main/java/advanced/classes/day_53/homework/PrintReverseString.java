package advanced.classes.day_53.homework;

import java.util.Scanner;

public class PrintReverseString {
    public static void main(String[] args) {
        System.out.println("Please enter input : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(new PrintReverseString().printReverseString(input, input.length(), new StringBuilder()));
    }

    private String printReverseString(String input, int length, StringBuilder sb) {
        if(length == 1)
            return sb.append(input.charAt(0)).toString();
        else
            return printReverseString(input, length-1, sb.append(input.charAt(length-1)));
    }
}

/*
 * Write a recursive function that, given a string S, prints the characters of S in reverse order.
 *
 * Problem Constraints : 1 <= |s| <= 1000
 *
 * Input Format : First line of input contains a string S.
 * Output Format: Print the character of the string S in reverse order.
 *
 * Input : scaleracademy
 * Output: ymedacarelacs
 * Explanation : Print the reverse of the string in a single line using recursion methodology.
 *
 * Input : cool
 * Ouptut: looc
 */