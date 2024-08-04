package method;

public class Method1Ref {

    public static void main(String[] args) {
        // Calculation 1
        int sum1 = add(5, 10);
        System.out.println("sum1 = " + sum1);
        
        // Calculation 2
        int sum2 = add(15, 20);
        System.out.println("sum2 = " + sum2);
    }

    // modifier + return type + method name + parameter + method body
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " calculating ...");
        int sum = a + b;
        return sum;
    }
}
