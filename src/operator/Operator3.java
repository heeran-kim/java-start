package operator;

public class Operator3 {

    public static void main(String[] args) {
        // multiplication is prior to addition, subtraction
        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
