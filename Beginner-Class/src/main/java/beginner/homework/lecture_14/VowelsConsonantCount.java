package beginner.homework.lecture_14;

public class VowelsConsonantCount {
    public static void main(String[] args) {
        String input = "Gautam Raj";
        int[] output = countVowelConsonants(input);
        System.out.println("Input : "+input);
        System.out.println("No of vowels : "+output[0]);
        System.out.println("No of consonants : "+output[1]);
    }

    public static int[] countVowelConsonants(String A) {
        int vowelCount = 0;
        int consonantCount = 0;

        for(int i=0; i < A.length(); i++){
            if(isVowel(A.charAt(i)) && isAlphabet(A.charAt(i))){
                vowelCount++;
            }else if(isAlphabet(A.charAt(i))){
                consonantCount++;
            }
        }

        int result[] = new int[2];
        result[0] = vowelCount;
        result[1] = consonantCount;

        return result;
    }

    private static boolean isVowel(char ch){
        if( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else return false;
    }

    private static boolean isAlphabet(char ch){
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) return true;
        else return false;
    }
}
