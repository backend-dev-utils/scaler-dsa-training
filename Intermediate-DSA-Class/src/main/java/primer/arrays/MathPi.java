package primer.arrays;

public class MathPi {
    public static void main(String[] args) {
        double pi = Math.PI; // 3.14159265358979323846
        System.out.println("Area of Circle : "+areaOfCircle(10 , pi));
        System.out.println("Volume of Sphere : "+volumeOfSphere(355, pi));
    }

    private static int areaOfCircle(int radius, double pi){
        return (int) Math.ceil(pi * radius * radius);
    }

    private static int volumeOfSphere(int radius, double pi){
        return (int) Math.ceil( 4 * pi * (radius * radius * radius) / 3);
    }
}
