package advanced.classes.day_54.homework;

import java.util.Arrays;

public class KthSymbol {
    public static void main(String[] args) {
        int rowNumber = 3;
        int index = 2;
        int array[][] = generatedArray(rowNumber);
        System.out.println(new KthSymbol().findKthValue(rowNumber, index));
    }

    private int findKthValue(int rowNumber, int index) {
        return 0;
    }


    private static int[][] generatedArray(int rowNumber) {
        int resultArray[][] = new int[rowNumber][];

        for (int i = 0; i <rowNumber ; i++) {
//            int dataArray[] = new int[rowNumber];
//            System.out.println(" length of data : "+ Arrays.toString(dataArray));
            for (int j = 0; j < 1; j++) {
                
            }
        }

        return resultArray;
    }
}
