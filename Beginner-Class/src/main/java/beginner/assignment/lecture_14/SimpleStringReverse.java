package beginner.assignment.lecture_14;

public class SimpleStringReverse {
    public static void main(String[] args) {
        String input = "Everyone loves data science";
        String output = "enoyrevE sevol atad ecneics";

        if(output.equals(reverseString(input))){
            System.out.println("Correct");
        }else {
            System.out.println("Wrong");
        }
    }

    private static String reverseString(String input) {
        String[] array = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<array.length; i++){
            array[i] = new StringBuilder(array[i]).reverse().toString();
        }
        for (int i = 0; i < array.length; i++) {
            result = result.append(array[i]).append(i< array.length-1 ? " " : "");
        }
        return result.toString().trim();
    }
}
