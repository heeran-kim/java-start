package method;

public class MethodValue2 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. before calling changeNumber, number: " + number);
        changeNumber(number);
        System.out.println("4. after calling changeNumber, number: " + number);
    }

    public static void changeNumber(int number) {
        // copy the value of input(num1) and assign it to the parameter(number)
        System.out.println("2. before changing number, number: " + number);
        number *= 2;
        System.out.println("3. after changing number, number: " + number);
    }
}
