package method;

public class Method2 {

    public static void main(String[] args) {
        // String str = printHeader();
        printHeader();
        System.out.println("Program...");
        printFooter();

    }

    // no return type + no parameter
    public static void printHeader() {
        System.out.println("Start the Program");
        return; // optional without return
    }

    public static void printFooter() {
        System.out.println("Exit the Program");
        return;
    }
}
