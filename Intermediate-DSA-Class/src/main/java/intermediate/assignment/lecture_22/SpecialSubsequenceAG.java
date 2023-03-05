package intermediate.assignment.lecture_22;

public class SpecialSubsequenceAG {
    public static void main(String[] args) {
        String input = "GAB";
        int countOfSubsequence = findCountOfSubsequence(input);
        System.out.println(countOfSubsequence);
    }

    private static int findCountOfSubsequence(String input) {
        int count_AG = 0;
        int count_A = 0;
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == 'A')
                count_A++;
            else if (input.charAt(index) == 'G'){
                count_AG += count_A;
            }
        }
        return count_AG;
    }
}
