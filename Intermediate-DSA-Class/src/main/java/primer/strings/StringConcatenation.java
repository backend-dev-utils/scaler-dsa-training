package primer.strings;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        String array[] = new String[testCases];

        for (int i = 0; i < testCases ; i++) {
            String firstString = sc.next();
            String secondString = sc.next();
            array[i] = firstString.concat(secondString);
        }
        for (String result : array){
            System.out.println(result);
        }
    }
}
