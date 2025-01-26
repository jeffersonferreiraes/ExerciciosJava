package entities;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(){

    }

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public Account(int accountNumber, String name, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
        balance += value;
    }

    public void withdraw(double value){
        balance -= value + 5.0;
    }

    @Override
    public String toString() {
        return "Account data:" + "\n" +
                "Account number = " + accountNumber +
                ", Name = " + name +
                ", Balance = $" + String.format("%.2f", getBalance());
    }
}
