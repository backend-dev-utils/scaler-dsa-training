package intermediate.assignment.lecture_17;

import java.util.Scanner;

public class IsItPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Number : ");
        int number = sc.nextInt();

        int count = 0;
        for(int i=1; i*i <= number; i++){
            if (number%i == 0){
                if(i*i == number)
                    count += 1;
                else
                    count += 2;
            }
        }

        if(count == 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}

/*
Input : 99563
Output: YES
 */