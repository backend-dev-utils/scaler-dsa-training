package advanced.classes.day_47.rough_work;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int array[] = {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        long result = 0;
        int power = 1;
        for (int i = array.length-1; i >= 0; i--) {
            result = result + (array[i] * power);
            power = power << 1;
        }
        System.out.println(result);
    }
}
