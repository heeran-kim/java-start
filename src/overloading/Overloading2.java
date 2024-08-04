package overloading;

public class Overloading2 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 1.2));
        System.out.println("2: " + add(1.2, 1));
    }

    public static double add(int a, double b) {
        System.out.println("1");
        return a + b;
    }

    public static double add(double a, int b) {
        System.out.println("2");
        return a + b;
    }
}
