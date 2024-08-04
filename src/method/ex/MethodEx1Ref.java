package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        printAverage(1, 2, 3);
        printAverage(15, 25, 35);
    }

    public static void printAverage(int a, int b, int c) {
        double average = average(a, b, c);
        System.out.println("average = " + average);
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
