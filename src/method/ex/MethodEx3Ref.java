package method.ex;

public class MethodEx3Ref {

    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(1000, balance);
        balance = withdraw(2000, balance);
        printBalance(balance);
    }

    public static int deposit(int amount, int balance) {
        balance += amount;
        System.out.println(amount + "won deposited. Balance: " + balance + "won");
        return balance;
    }

    public static int withdraw(int amount, int balance) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "won withdrew. Balance: " + balance + "won");
        } else {
            System.out.println(amount + "won attempted to withdraw but balance is not enough.");
        }
        return balance;
    }

    public static void printBalance(int balance) {
        System.out.println("Balance: " + balance + "won");
    }
}
