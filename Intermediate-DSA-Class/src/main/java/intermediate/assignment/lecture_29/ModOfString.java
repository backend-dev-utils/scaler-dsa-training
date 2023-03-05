package intermediate.assignment.lecture_29;

public class ModOfString {
    public static void main(String[] args) {

    }
    public static int findMod(String A, int B) {
        long sum=0,t=1;
        int l=A.length();
        for(int i=l-1;i>=0;i--){
            int r=A.charAt(i)-'0';
            sum=(sum + r*t)%B;
            t=(t*10)%B;
        }
        return (int)sum%B;
    }
}
