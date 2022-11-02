package advanced.classes.day_44.assignment;

/**
 * Cheated from Discussion Tab
 */
public class FirstMissingInteger {
    public static void main(String[] args) {
        System.out.println(new FirstMissingInteger().firstMissingPositive(new int[]{3, 4, -1, 1}));
    }
    public int firstMissingPositive(int[] A) {
        int n = A.length;
        for(int i=0; i<n; i++){
            if(A[i] < 0){
                A[i] = (n+2);
            }
        }

        for(int j=0; j<n; j++){
            int ele = Math.abs(A[j]);
            if(ele >= 1 && ele <= n){
                A[ele-1] = -1 * Math.abs(A[ele-1]);
            }
        }

        for(int k=0; k<n; k++){
            if(A[k] > 0){
                return (k+1);
            }
        }
        return (n+1);
    }
}
