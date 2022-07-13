package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WrapLines {
    public static void main(String[] args) {
        String array[] = {"This","is","a","book","about","Science","And",
                "You","should","read","it",
                "Let's","play","cricket","with","leather","ball",
                "okay", "so","who","wants","to","go","for","balling"};

        Scanner sc = new Scanner(System.in);
        int numberOfCharactersInLine = sc.nextInt();

        List<String> list = wrapWordsIntoLines(array, numberOfCharactersInLine);
        list.forEach(System.out::println);
    }

    private static List<String> wrapWordsIntoLines(String[] array, int lengthOfStatement) {
        return null;
    }
}
