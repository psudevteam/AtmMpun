package src.transactions.java;

public abstract class Transaction {
    private String name;
    private int pin;
    private double balance;

    public Transaction(String accountHolder, int accountPin, double accountBalance){
        this.setName(accountHolder);
        this.setPin(accountPin);
        this.setBalance(accountBalance);
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setPin(int newPin){
        this.pin = newPin;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getPin(){
        return this.pin;
    }

    public void Transfer(int amountBalance){
        this.balance -= amountBalance;
    }

    public void receiveTransfer(int amountBalance){
        this.balance += amountBalance;
    }
}

