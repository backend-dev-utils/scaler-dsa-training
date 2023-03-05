package beginner.homework.lecture_14;

import java.util.Scanner;

public class TrimFromEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(trimFromEndsPerfectSolution(input));
        System.out.println(trimFromEndsSimpleSolution(input));
    }

    private static String trimFromEndsPerfectSolution(String input){
        int index = 0;
        int subStringStartIndex = 0;
        int subStringLastIndex = 0;
        while(index <= input.length()-1){
            if(isAlphabet(input.charAt(index))){
                subStringStartIndex = index;
                break;
            }else{
                index++;
            }
        }
        index = input.length() - 1;
        while (index >= 0){
            if(isAlphabet(input.charAt(index))){
                subStringLastIndex = index + 1;
                break;
            }else{
                index--;
            }
        }
        return input.substring(subStringStartIndex,subStringLastIndex);
    }

    private static boolean isAlphabet(char ch){
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) return true;
        else return false;
    }

    private static String trimFromEndsSimpleSolution(String input) {
        input = input.replaceAll("[*]", " "); // study about regex
        return input.trim().replaceAll(" ","*");
    }
}

/*
Input : "**h*e*l*lo*"
Description : The string has 2 leading '*' and 1 trailing '*'. Removing them, the string becomes "hello".
Output : "h*e*l*l*o"

Test cases covered :
zn*ibzv -> zn*ibzv
**rel -> rel
n* -> n
* ->
*/