package beginner.homework.lecture_5;

import java.util.Scanner;

public class FullNumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalRows = scanner.nextInt();
        int rowNumber = 1;
        for (int i=totalRows; i>= 1; i--){
            int tempValue = rowNumber;
            for (int j=1; j<=totalRows; j++){
                if (i <= j){
//                    System.out.print((i<j ? " " : "")+tempValue);
                    System.out.print(tempValue+" ");
                    tempValue++;
                }else
//                    System.out.print(0 + (i>j ? " ":""));
                    System.out.print(0 + " ");
            }

            int reducedTempValue = tempValue-2;
            for (int j = totalRows-1; j >= 1 ; j--) {
                if(j >= i){
//                    System.out.print((i>j ? "" : " ") + reducedTempValue);
                    System.out.print(reducedTempValue+" ");
                    reducedTempValue--;
                }else
//                    System.out.print((j<i ? " ":" ") + 0);
                    System.out.print(0 + " ");
            }

            System.out.println();
            rowNumber++;
        }
    }
}

/* Output :
0 0 0 0 1 0 0 0 0
0 0 0 2 3 2 0 0 0
0 0 3 4 5 4 3 0 0
0 4 5 6 7 6 5 4 0
5 6 7 8 9 8 7 6 5
*/