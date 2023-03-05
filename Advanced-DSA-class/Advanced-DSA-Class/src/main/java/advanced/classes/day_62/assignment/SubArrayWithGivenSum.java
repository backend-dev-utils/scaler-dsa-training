package advanced.classes.day_62.assignment;

import java.util.ArrayList;

/**
 * cheated from discussion tab
 */

public class SubArrayWithGivenSum {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int i = 0 ;
        int j = 0 ;
        long sum = 0 ;
        ArrayList<Integer> resp =  new ArrayList<Integer>();

        while( j < A.size() ){
            sum += A.get(j);
            j++;

            while(sum > B  ){
                sum = sum - A.get(i);
                i++;
            }

            if(sum == B){
                return new ArrayList<Integer>( A.subList(i,j)) ;
            }
        }
        resp.add(-1);
        return resp  ;
    }
}
