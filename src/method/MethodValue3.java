package method;

public class MethodValue3 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. before calling changeNumber, num1: " + num1);
        num1 = changeNumber(num1);
        System.out.println("4. after calling changeNumber, num1: " + num1);
    }

    public static int changeNumber(int num2) {
        // copy the value of input(num1) and assign it to the parameter(num2)
        System.out.println("2. before changing num2, num2: " + num2);
        num2 *= 2;
        System.out.println("3. after changing num2, num2: " + num2);
        return num2;
    }
}
