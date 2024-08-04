package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double doublenum = 1.5;
        // printNumer(doublenum); // compile error
        printIntNumer((int) doublenum); // explicit type casting

        // when converting a smaller data type to a larger data type
        int intnum = 2;
        printDoubleNumer(intnum); // implicit type casting
    }

    public static void printIntNumer(int n) {
        System.out.println("n = " + n);
    }

    public static void printDoubleNumer(double n) {
        System.out.println("n = " + n);
    }
}
