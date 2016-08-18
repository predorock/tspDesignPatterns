package predo.patterns.proxy.security;

/**
 * Created by predo1 on 18/08/16.
 */
public interface Account {
    void deposit(int amount);
    void withdraw(int amount);
    int balance();
}
