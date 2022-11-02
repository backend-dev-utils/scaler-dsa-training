package advanced.classes.day_63.assignment;

import java.util.HashMap;

/**
 * Cheated from Discussion
 */
public class DistinctNumbersInWindow {
    public static void main(String[] args) {

    }

    public int[] dNums(int[] A, int B) {
        int n = A.length;
        int [] ans = new int [n - B + 1];
        HashMap<Integer, Integer> map =  new HashMap<>();
        for(int i = 0; i < B; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1);
            }
            else{
                map.put(A[i] , 1);
            }
        }
        ans[0] = map.size();
        int start = 1;
        int end = B;
        while(start < (n - B + 1)){
            if(map.containsKey(A[end])){
                map.put(A[end], map.get(A[end]) + 1);
            }
            else{
                map.put(A[end], 1);
            }
            if(map.containsKey(A[start - 1])){
                map.put(A[start - 1], map.get(A[start - 1]) - 1);
                if(map.get(A[start - 1]) == 0){
                    map.remove(A[start - 1]);
                }
            }
            ans[start] = map.size();
            start++;
            end++;
        }
        return ans;
    }
}
