package primer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertThat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(i, sc.nextInt());
        }

        int addIndexElement = sc.nextInt();
        int element = sc.nextInt();
        list.add(addIndexElement - 1 , element);

        for (Integer x : list)
            System.out.print(x + " ");
    }
}

/*
5
2 3 1 4 2
0
5
*/