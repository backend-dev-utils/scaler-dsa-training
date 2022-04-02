package beginner.assignment.lecture_1;

import java.util.Scanner;

public class MaxOfThree {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();

            if(first > second){
                if(first > third){
                    System.out.println(first);
                }else{
                    System.out.println(third);
                }
            }else{
                if(second > third){
                    System.out.println(second);
                }else{
                    System.out.println(third);
                }
            }
        }

}
