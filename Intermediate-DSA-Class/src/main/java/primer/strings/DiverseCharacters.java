package primer.strings;

public class DiverseCharacters {
    public static void main(String[] args) {
        String input = "HelloUser1";
    }

    private int countMaxOfDigitCharacter(String input){
        int countOfDigits = 0, countOfChars = 0;
        for (int i = 0; i < input.length(); i++) {
            if(Character.isAlphabetic(input.charAt(i)))
                countOfChars++;
            else
                countOfDigits++;
        }
        return countOfChars > countOfDigits ? countOfChars : countOfDigits;
    }
}
