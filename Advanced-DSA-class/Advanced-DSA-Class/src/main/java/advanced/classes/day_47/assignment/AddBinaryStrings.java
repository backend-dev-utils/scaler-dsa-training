package advanced.classes.day_47.assignment;

public class AddBinaryStrings {
    public static void main(String[] args) {
        AddBinaryStrings addBinaryStrings = new AddBinaryStrings();
        System.out.println(addBinaryStrings.addBinary("10001100010111000101100010100110001001101010000010011010", "101111000100100100111110010010101110101001100100101001111010011000000110"));
    }

    public String addBinary(String A, String B){

        if(A.equals(null) && B.equals(null)) return "";
        int first = A.length() - 1;
        int second = B.length() - 1;

        StringBuilder sb = new StringBuilder();
        int carrySum = 0;

        while(first >= 0 || second >= 0){
            int sum = carrySum;
            if (first >= 0){
                sum = sum + A.charAt(first) - '0';
                first--;
            }
            if(second >= 0){
                sum = sum + B.charAt(second) - '0';
                second--;
            }

            carrySum = sum >> 1;
            System.out.println("CarrySum : "+carrySum+", Sum : "+sum);
            sum = sum & 1;

            sb.append(sum == 0 ? '0' : '1');
        }
        if(carrySum > 0) sb.append('1');
        sb.reverse();
        return sb.toString();
    }
}