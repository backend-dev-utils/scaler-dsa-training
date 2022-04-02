package beginner.homework.lecture_10;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println(areaOfCircle(85));
    }

    private static int areaOfCircle(int i) {
        return (int) Math.ceil (3.141592 * i * i);
    }

}
