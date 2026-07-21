class BankAccount {
    private int balance = 5000;
    public void deposit(int amount) {
        balance = balance + amount;
    }
    public int getBalance() {
        return balance;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(2000);
        System.out.println("Balance = " + account.getBalance());
    }
}