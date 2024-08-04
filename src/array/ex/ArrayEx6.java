package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of inputs: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int min, max;

        System.out.println("Enter " + count + " int numbers: ");

        for (int i = 0; i < numbers.length; i ++){
            numbers[i] = scanner.nextInt();
        }

        min = max = numbers[0];
        for (int i = 1; i < numbers.length; i ++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
