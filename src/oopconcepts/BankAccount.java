
package oopconcepts;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        setBalance(balance);
    }

    public void setBalance(double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException(
                "Balance cannot be negative."
            );
        }

        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        // account.setBalance(-5000); // Invalid balance

        System.out.println(account.getBalance());
    }
}
