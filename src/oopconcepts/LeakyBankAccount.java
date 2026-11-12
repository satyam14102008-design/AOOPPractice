
package oopconcepts;

public class LeakyBankAccount {

    private double balance;

    public LeakyBankAccount(double balance) {
        this.balance = balance;
    }

    // Unsafe setter: no validation
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        LeakyBankAccount account =
            new LeakyBankAccount(1000);

        account.setBalance(-5000);

        System.out.println(account.getBalance());
    }
}
