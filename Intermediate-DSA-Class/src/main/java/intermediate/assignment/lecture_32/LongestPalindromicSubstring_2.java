package intermediate.assignment.lecture_32;

public class LongestPalindromicSubstring_2 {
    public static void main(String[] args) {
        String input = "bbcccbb";
        //bbcccbb
        input = new LongestPalindromicSubstring_2().findLongestPalindrome(input);
        System.out.println(input);
    }
    private String findLongestPalindrome(String A) {
        String ans = "";
        int n = A.length();
        for (int index = 0; index < n ; index++) {
            String str = expand(A,index, index);
            if(str.length() > ans.length())
                ans = str;
        }
        for (int index = 0; index < n-1 ; index++) {
            String str = expand(A,index,index + 1);
            if(str.length() > ans.length())
                ans = str;
        }
        return ans;
    }

    private String expand(String s, int i, int j) {
        while( i >= 0 && j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                i--; j++;
            }else{
                return s.substring(i+1, j);
            }
        }
        return s.substring(i+1, j);
    }


}
