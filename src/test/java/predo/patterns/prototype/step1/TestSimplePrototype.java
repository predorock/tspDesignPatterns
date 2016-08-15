package predo.patterns.prototype.step1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by predo1 on 15/08/16.
 */
public class TestSimplePrototype {

    @Test
    public void testCookiePrototype(){
        CookieMachine cookieMachine = new CookieMachine();

        assertFalse(cookieMachine.makeCookie().equals(cookieMachine.makeCookie()));
    }
}
