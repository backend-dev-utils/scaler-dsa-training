package beginner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "n*";
        int n = s.length();
        System.out.println(s.substring(0, 1));
        while(n > 0){
//            System.out.print(s.charAt(n-1)+" ");
            n--;
        }
    }
}
