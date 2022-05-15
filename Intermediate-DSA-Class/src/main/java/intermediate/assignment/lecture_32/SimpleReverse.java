package intermediate.assignment.lecture_32;

public class SimpleReverse {
    public static void main(String[] args) {
        String input = "scaler";
        input = simpleReverse(input);
        System.out.println(input);
    }

    private static String simpleReverse(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }
}
