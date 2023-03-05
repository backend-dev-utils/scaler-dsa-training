package intermediate.assignment.lecture_26;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String A = "1010110111001101101000";
        String B = "1000011011000000111100110";

        String result = addBinaryStrings(A , B);
        System.out.println(result);
    }

    private static String addBinaryStrings(String A, String B) {
        return String.valueOf(Long.parseLong(A)+Long.parseLong(B));
    }
}