package beginner.assignment.lecture_14;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(solve("abcbae"));
    }

    public static int solve(String A) {
        for(int i = 0, n = A.length()-1; i<A.length()/2 || n > A.length()/2; i++, n--){
            if(A.charAt(i) != A.charAt(n)){
                return 0;
            }
        }
        return 1;
    }
}
