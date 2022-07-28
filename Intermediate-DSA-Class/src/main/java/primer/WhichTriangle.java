package primer;

import java.util.Scanner;

public class WhichTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sideOne = sc.nextInt();
        int sideTwo = sc.nextInt();
        int sideThree = sc.nextInt();

        if(sideOne == sideTwo && sideTwo == sideThree){
            System.out.println("equilateral");
        }
        else if(sideOne == sideTwo || sideTwo == sideThree || sideThree == sideOne){
            System.out.println("isosceles");
        }
        else{
            System.out.println("scalene");
        }
    }
}
