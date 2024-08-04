package array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 int numbers: ");

        for (int i = 0; i < numbers.length; i ++){
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            System.out.print(number);
            if (number == numbers[4]) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
    }
}
