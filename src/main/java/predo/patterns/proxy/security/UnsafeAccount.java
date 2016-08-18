package predo.patterns.proxy.security;

/**
 * Created by predo1 on 18/08/16.
 */
public class UnsafeAccount implements Account {

    private int balance;

    public UnsafeAccount(int initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public int balance() {
        return this.balance;
    }
}
