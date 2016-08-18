package predo.patterns.proxy;

import org.junit.Test;
import predo.patterns.proxy.security.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by predo1 on 18/08/16.
 */
public class TestSecurityProxyPattern {

    @Test
    public void testUnsafeAccount(){
        Account account = new UnsafeAccount(10);
        assertEquals(10, account.balance());
        account.withdraw(4);
        assertEquals(6, account.balance());
        account.deposit(25);
        assertEquals(31, account.balance());
    }

    @Test
    public void testSafeAccount(){
        SecurityProxy account = new SecurityProxy(10, "predorock", "proxypattern");
        assertEquals(10, account.balance());
        account.withdraw(4);
        assertEquals(6, account.balance());
        account.deposit(25);
        assertEquals(31, account.balance());
    }

    @Test(expected = IllegalAccessError.class)
    public void testSafetyCheck(){
        SecurityProxy account = new SecurityProxy(10, "predorock", "pippo");
        account.balance();
    }
}
