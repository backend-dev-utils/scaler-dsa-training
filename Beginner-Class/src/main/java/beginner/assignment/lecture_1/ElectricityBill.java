package beginner.assignment.lecture_1;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solve(sc.nextInt()));
    }

    public static int solve(int unit) {
        double billAmount = 0;
        int leftUnit = 0;

        if(unit > 250){
            leftUnit = unit - 250;
            billAmount = (leftUnit * 1.5) + 220;
        }else if(unit <= 250 && unit >150){
            leftUnit = unit - 150;
            billAmount = (leftUnit * 1.2) + 100;
        }else if(unit <= 150 && unit > 50){
            leftUnit = unit - 50;
            billAmount = (leftUnit * 0.75) + 25;
        }else if(unit <= 50){
            billAmount = unit * 0.5;
        }

        return (int) (billAmount + (billAmount * 0.2));
    }
}
