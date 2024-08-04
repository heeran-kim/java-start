package method;

public class MethodReturn1 {

    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static Boolean odd(int i) {
        return i % 2 == 1;

        /*
        no return statement if it is not odd -> compile error
        if (i %2 == 1) {
            return true;
        }
         */
    }
}
