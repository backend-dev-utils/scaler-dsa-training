package interview;

import java.util.Arrays;

public class ThirdMaxElement {
    public static void main(String[] args) {
        int[] arr = { -500,-400,-300,2,-200,-100 };
        int length = arr.length;

        for (int j = 0; j < length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[arr.length - 3]);
    }
}
