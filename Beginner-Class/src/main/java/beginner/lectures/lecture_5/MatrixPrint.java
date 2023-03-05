package beginner.lectures.lecture_5;

import java.util.Scanner;

public class MatrixPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i=1; i<=number; i++){
            for(int j=1; j<=number; j++){
                System.out.print("["+i+","+j+"]");
            }
            System.out.println();
        }
    }
}
