package primer;

import java.util.Scanner;

public class CategoriesPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float height = sc.nextFloat();

        if(height >= 195.0){
            System.out.println("abnormal");
        } else if (195.0 > height && height >= 165.0 ) {
            System.out.println("taller");
        } else if (165.0 > height && height >= 150) {
            System.out.println("average");
        }else if (150.0 > height){
            System.out.println("dwarf");
        }
    }
}
