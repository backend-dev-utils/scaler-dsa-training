package primer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveThat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(i, sc.nextInt());
        }

        int removingIndexElement = sc.nextInt();
        list.remove(removingIndexElement - 1);

        for (Integer x : list)
            System.out.print(x + " ");
    }
}
