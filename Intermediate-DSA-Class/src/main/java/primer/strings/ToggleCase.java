package primer.strings;

public class ToggleCase {

    public String solve(String A) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<A.length(); i++){
            if(Character.isLowerCase(A.charAt(i)))
                sb.append(Character.toUpperCase(A.charAt(i)));
            else if(Character.isUpperCase(A.charAt(i)))
                sb.append(Character.toLowerCase(A.charAt(i)));
        }
        return sb.toString();
    }
}
