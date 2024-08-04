package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            printMenu();

            int choice = scanner.nextInt();

            switch (choice){
                case 1 -> balance = deposit(scanner, balance);
                case 2 -> balance = withdraw(scanner, balance);
                case 3 -> checkBalance(balance);
                case 4 -> {
                    System.out.println("Terminate the program.");
                    return;
                }
                default -> System.out.println("Wrong Number");
            }
        }

    }

    private static void checkBalance(int balance) {
        System.out.println("Current Balance: " + balance + " won");
    }

    public static void printMenu(){
        System.out.println("-------------------------------------------------------");
        System.out.println(" 1. Deposit | 2. Withdraw | 3. Balance | 4. Terminate");
        System.out.println("-------------------------------------------------------");
        System.out.print("Choice: ");
    }

    public static int deposit(Scanner scanner, int balance) {
        System.out.print("Enter the deposit amount: ");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println(amount + " won deposited. Balance: " + balance + " won");
        return balance;
    }

    public static int withdraw(Scanner scanner, int balance) {
        System.out.print("Enter the withdraw amount: ");
        int amount = scanner.nextInt();
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " won withdrew. Balance: " + balance + " won");
        } else {
            System.out.println(amount + " won attempted to withdraw but balance is not enough.");
        }
        return balance;
    }

    public static void printBalance(int balance) {
        System.out.println("Balance: " + balance + " won");
    }
}
