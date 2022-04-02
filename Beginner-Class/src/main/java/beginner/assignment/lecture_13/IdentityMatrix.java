package beginner.assignment.lecture_13;

public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] A = {{0,0},{1,0},{0,1}};
        boolean isIdentityMatrix = isIdentityMatrix(A);
        if (isIdentityMatrix)
            System.out.println(1);
        else
            System.out.println(0);

        System.out.println(solve(A));
    }

    private static boolean isIdentityMatrix(int[][] A) {
        boolean checkDecision = false;
        for (int rows = 0; rows < A.length; rows++) {
            for (int columns = 0; columns < A[rows].length; columns++) {
                if( rows == columns && A[rows][columns] != 1){
                    return false;
                }else if(rows != columns && A[rows][columns] != 0){
                    return false;
                }else{
                    checkDecision = true;
                }
            }
        }
        return checkDecision;
    }

    /**
     * Scaler Program
     * @param A
     * @return
     */
    private static int solve(int[][] A){
        int checkDecision = 0;
        for (int rows = 0; rows < A.length; rows++) {
            for (int columns = 0; columns < A[rows].length; columns++) {
                if( rows == columns && A[rows][columns] != 1){
                    return 0;
                }else if(rows != columns && A[rows][columns] != 0){
                    return 0;
                }else{
                    checkDecision = 1;
                }
            }
        }
        return checkDecision;
    }
}
/*

All the diagonal elements are 1 and other all elements are 0,
those Matrices are identical.

Input :
[[1, 0]
[0, 1]]

Output :
1
 */