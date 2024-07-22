package casting;

public class Casting3 {

    public static void main(String[] args) {
        // Max value of int assigned to long
        // automatic casting from int to long by Java
        long maxIntValue = 2147483647;
        // long maxIntValue = 2147483647L;
        long maxIntOver = 2147483648L; // Over the max
        int intValue = 0;
        
        intValue = (int) maxIntValue; // casting
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // casting
        System.out.println("maxIntOver casting = " + intValue);
        // It causes overflow
    }
}
