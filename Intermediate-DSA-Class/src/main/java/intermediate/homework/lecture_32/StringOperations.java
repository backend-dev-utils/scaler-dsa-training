package intermediate.homework.lecture_32;

public class StringOperations {
    public static void main(String[] args) {
        String input = "AbcaZeoB";

        String output = performStringOperation(input);
        System.out.println(output);
    }

    private static String performStringOperation(String input) {
        String output = "";
        output = input+input;

        for (int index = 0; index < output.length(); index++) {
            if (output.charAt(index) < 91 && output.charAt(index) > 64)
                output = output.replace(output.charAt(index), '~');
        }

        output = output.replaceAll("~","");

        for (int isVowelIndex = 0; isVowelIndex < output.length(); isVowelIndex++) {
            if (output.charAt(isVowelIndex) == 'a' || output.charAt(isVowelIndex) == 'e' ||
                    output.charAt(isVowelIndex) == 'i' || output.charAt(isVowelIndex) == 'o' ||
                    output.charAt(isVowelIndex) == 'u')
                output = output.replace(output.charAt(isVowelIndex), '#');
        }

        return output;
    }
}

/**
 * Akash likes playing with strings.
 * One day he thought of applying following operations on the string in the given order:
 *
 * Concatenate the string with itself.
 * Delete all the uppercase letters.
 * Replace each vowel with '#'.
 * You are given a string A of size N consisting of lowercase and uppercase alphabets.
 * Return the resultant string after applying the above operations.
 *
 * NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
 */

/*
    Input:
    string = "AbcaZeoB"

    Output: "bc###bc###"

    Explanation:    First concatenate the string with itself so input string becomes "AbcaZeoBAbcaZeoB".
                    Delete all the uppercase letters so input string becomes "bcaeobcaeo".
                    Now replace vowel with '#' and output is "bc###bc###"
*/