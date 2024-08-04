package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 4;
        String[] subjects = {"Korean", "English", "Math"};
        int[][] scores = new int[numStudents][subjects.length];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter the scores of student " + (i + 1));
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " Score: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            double average;

            for (int j = 0; j < subjects.length; j++) {
                total += scores[i][j];
            }
            average = (double) total / subjects.length;

            System.out.println("Total Scores of Student " + (i + 1) + ": " + total + ", Average: " + average);
        }
    }
}
