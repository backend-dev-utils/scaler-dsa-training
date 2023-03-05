package advanced.classes.day_51.assignment;

import java.util.Arrays;

public class CountOfDivisors {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountOfDivisors().countOfDivisors(new int[]{2, 3, 4, 5})));
    }

    public int[] countOfDivisors(int[] A) {
        int result[] = new int[A.length];
        for(int i = 0; i<A.length; i++){
            result[i] = findCountOfDivisors(A[i]);
        }
        return result;
    }

    private int findCountOfDivisors(int number){
        int count = 0;
        for(int i = 1; i <= Math.sqrt(number) ; i++){ // think about this logic
            if( number%i == 0 ){
                if(number/i == i)
                    count++;
                else
                    count += 2; // look carefully
            }
        }
        return count;
    }
}
