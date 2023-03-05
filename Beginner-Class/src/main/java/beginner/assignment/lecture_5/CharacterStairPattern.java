package beginner.assignment.lecture_5;

import java.util.Scanner;

public class CharacterStairPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        char ch = 'A';
        for(int i=1; i<= number; i++){

            for(int j=1; j<=i; j++){
                System.out.print(ch + (i>j ? " " : ""));
            }
            ch++;
            System.out.println();
        }
    }
}
