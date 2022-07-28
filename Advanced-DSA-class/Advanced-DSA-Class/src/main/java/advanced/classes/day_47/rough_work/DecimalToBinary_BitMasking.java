package advanced.classes.day_47.rough_work;

public class DecimalToBinary_BitMasking {
    public static void main(String[] args) {
        int number = 6;
        StringBuilder sb = new StringBuilder();
        while(number > 0){
            int lastBit = (number & 1);
            sb.append(lastBit);
            number = number >> 1;
        }
        System.out.println(sb.reverse());
    }
}
