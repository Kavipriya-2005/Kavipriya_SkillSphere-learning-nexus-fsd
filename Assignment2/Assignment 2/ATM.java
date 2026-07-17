import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATM {

    static void withdraw(int balance, int amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + (balance - amount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        try {
            withdraw(balance, amount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction Completed");
        }

        sc.close();
    }
}