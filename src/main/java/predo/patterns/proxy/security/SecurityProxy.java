package predo.patterns.proxy.security;

/**
 * Created by predo1 on 18/08/16.
 */
public class SecurityProxy implements Account {

    private UnsafeAccount account;

    private String user;
    private String password;

    private boolean access;

    public SecurityProxy(int initialBalance, String user, String password){
        this.account = new UnsafeAccount(initialBalance);
        this.user = user;
        this.password = password;
        this.access = SecurityManager.checkCredentials(user,password);
    }

    public void deposit(int amount) {
        this.accessControl();
        account.deposit(amount);
    }

    public void withdraw(int amount) {
        this.accessControl();
        account.withdraw(amount);
    }

    public int balance() {
        this.accessControl();
        return account.balance();
    }

    private void accessControl(){
        if(!access) throw new IllegalAccessError("Credentials for user " + this.user + " are invalid");
    }
}
