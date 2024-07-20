package variable;

public class Var8 {

    public static void main(String[] args) {
        // whole number (literal default: int)
        // Java is designed to deal with int efficiently
        // If large number is expected, then use long.
        byte b = 127; // -128 ~ 127; too small, commonly not used.
        short s = 32767; // -32,768 ~ 32,767; same as byte.
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647
        long l = 9223372036854775807L; // l is okay but not recommended

        // real number (literal default: double)
        float f = 10.0f; // too low precision, commonly not used.
        double d = 10.0;

        char c = 'A'; // commonly not used.
        // String is dynamic allocated
        String st = "Hello Java";
    }
}
