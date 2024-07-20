package operator;

public class Operator1 {

    public static void main(String[] args) {
        // initialisation
        int a = 5;
        int b = 2;

        // Add / addition
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // Subtract / subtraction
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // Multiply / multiplication
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // Divide / division
        int div = a / b; // 2.5
        System.out.println("a / b = " + div);
        double divDouble = (double) a / b; // int division result is not automatically converted to double or float
        System.out.println("divDouble = " + divDouble);
        // Divide by zero is not a compile error but a run-time error.
        
        // modular, remainder
        int mod = a % b;
        System.out.println("mod = " + mod);
    }
}
