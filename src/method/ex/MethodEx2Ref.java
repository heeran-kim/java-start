package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";

        printMessage(3, "hi");
        printMessage(5, "hello");
        printMessage(7, message);
    }

    public static void printMessage(int n, String message){
        for (int i = 0; i < n; i ++) {
            System.out.println(message);
        }
    }
}
