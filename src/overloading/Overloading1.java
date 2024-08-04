package overloading;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    // method signature = method name + parameter type(order)
    // For example, return type and parameter name are not in method signature
    // int add(int a, int b) == double add(int c, int d) => compile error

    public static int add(int a, int b) {
        System.out.println("1");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2");
        return a + b + c;
    }
}
