package intermediate.homework.lecture_21;

import java.util.Arrays;

/**
 * Given an array of integers A, find and return the product array of the same size
 * where the ith element of the product array will be equal to the product of all the elements
 * divided by the ith element of the array.
 *
 * Note: It is always possible to form the product array with integer (32 bit) values.
 */
public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};

        int productArrayPuzzle[] = findProductOfArrayPuzzle(array);
        System.out.println(Arrays.toString(productArrayPuzzle));
    }

    private static int[] findProductOfArrayPuzzle(int[] array) {
        long product = 1;
        for (int index = 0; index < array.length; index++) {
            if(array[index] != 0){
                product = product * array[index];
            }
        }
        int productArray[] = new int[array.length];
        for (int productArrayIndex = 0; productArrayIndex < productArray.length; productArrayIndex++) {
            if(array[productArrayIndex] != 0)
            productArray[productArrayIndex] = (int) (product / array[productArrayIndex]);
        }
        return productArray;
    }
}

/*
    Input   :
            A = [1, 2, 3, 4, 5]
            B = [5, 1, 10, 1]
    Output  :
            A = [120, 60, 40, 30, 24]
            B = [10, 50, 5, 50]
*/