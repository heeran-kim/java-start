package operator;

public class OperatorAdd1 {

    public static void main(String[] args) {
        // w/o increment operator
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a);

        a = a + 1;
        System.out.println("a = " + a);

        // w/ increment operator
        ++a;
        System.out.println("a = " + a);
        ++a; // prefix
        System.out.println("a = " + a);
        ++a; // postfix
        System.out.println("a = " + a);
    }
}
