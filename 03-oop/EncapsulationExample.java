// Topic: Encapsulation
// Description: Demonstrates data hiding using private fields and getters/setters

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(1000);

        System.out.println("Balance: " + account.getBalance());
    }
}