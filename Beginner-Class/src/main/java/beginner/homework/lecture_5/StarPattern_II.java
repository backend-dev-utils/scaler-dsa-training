package beginner.homework.lecture_5;

import java.util.Scanner;

public class StarPattern_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=number; i>=1; i--){
            System.out.print("*");
        }
        System.out.println();
        for(int i=number-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
