package overloading;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 1));
        System.out.println("2: " + add(1.2, 1.2));
    }

    // if int add() is not existed, 1: add call double add() using implicit type casting
    public static int add(int a, int b) {
        System.out.println("1");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2");
        return a + b;
    }
}
