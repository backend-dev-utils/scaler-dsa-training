package intermediate.assignment.lecture_29;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        System.out.println(new ExcelColumnNumber().titleToNumber("BA"));
    }

    public int titleToNumber(String A) {
        int number = 0;
        for(int i=0;i<A.length();i++){
            int res = A.charAt(i) - 64;
            number = number * 26 + res ;
        }
        return number;
    }
}
