package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + ": minor is not allowed");
            return; // return -> exit the method
        }

        System.out.println(age + ": enter");
    }
}
