package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "won deposited. Balance: " + balance + "won");

        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "won withdrew. Balance: " + balance + "won");
        } else {
            System.out.println(withdrawAmount + "won attempted to withdraw but balance is not enough.");
        }

        System.out.println("Final balance: " + balance + "won");
    }
}
