class BankAccount {
    String accountHolderName, 
    accountNumber;
    double balance;
    BankAccount(String name, String number, double bal) {
        accountHolderName = name; accountNumber = number; balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient balance!");
        else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Remaining balance: " + balance);
        }
    }
}

public class Homework2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Suraj", "MZE1", 1000);
        acc.deposit(500);
        acc.withdraw(100);
        acc.withdraw(10000);
    }
}
