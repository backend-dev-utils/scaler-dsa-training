package advanced.classes.day_48.homework;

public class DivideIntegers {
    public static void main(String[] args) {
        System.out.println(new DivideIntegers().divide(5, 2));
    }

    private int divide(int A, int B) {
        return Math.abs((int) Math.floorDiv(A, B));
    }
}
