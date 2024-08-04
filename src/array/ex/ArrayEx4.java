package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average;

        System.out.println("Enter 5 int numbers: ");

        for (int i = 0; i < numbers.length; i ++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
