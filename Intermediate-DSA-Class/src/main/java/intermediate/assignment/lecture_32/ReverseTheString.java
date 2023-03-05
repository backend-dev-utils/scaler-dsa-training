package intermediate.assignment.lecture_32;

public class ReverseTheString {
    public static void main(String[] args) {
        String input = "the sky is blue";
        input = reverseTheString(input);
        System.out.println(input);
    }

    private static String reverseTheString(String input) {
        input = input.trim();
        String array[] = input.split(" ");
        for (int startIndex = 0, lastIndex = array.length - 1; startIndex < array.length/2; startIndex++, lastIndex--) {
            String temp = array[startIndex];
            array[startIndex] = array[lastIndex];
            array[lastIndex] = temp;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < array.length; index++) {
            stringBuilder.append(array[index]+" ");
        }
        return stringBuilder.toString().trim();
    }
}
