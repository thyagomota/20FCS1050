/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 29 - Account
 */

/*
A bank account is defined by a number (integer), the name of the owner, and a balance. Users should have the ability to create an account by specifying its number and owner. Balance is always initialized to zero. The class should provide methods to allow deposit (amount informed as parameter), withdraw (amount informed as parameter; balance cannot become negative). You should also implement the “toString” method.
 */
public class Account {

    private int    number;
    private String owner;
    private double balance;
    private static final double MIN_BALANCE = 0;

    public Account(int number, String owner) {
        this.number = number;
        this.owner  = owner;
        balance = MIN_BALANCE;
    }

    public void deposit(double amount) {
        if (amount > MIN_BALANCE)
            balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance - amount < MIN_BALANCE)
            return false;
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "number: " + number + "; owner: " + owner + "; current balance is $" + balance;
    }

}
