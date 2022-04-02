package beginner.assignment.lecture_14;

public class WordOccuranceStartPosition {
    public static void main(String[] args) {
        String input = "aabababaa";
        String checkString = "ca";
        int index = 0;
        if(input.contains(checkString)){
            index = input.indexOf(checkString) + 1;
        }else{
            index = -1;
        }
        System.out.println(index);
    }
}
