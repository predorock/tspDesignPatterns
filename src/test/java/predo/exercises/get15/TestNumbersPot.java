package predo.exercises.get15;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by predo1 on 28/08/16.
 */
public class TestNumbersPot {

    public Get15Pot pot;

    @Before
    public void before(){
        pot = new Get15Pot();
    }

    @Test
    public void testPotRangeNumber(){
        assertTrue(this.pot.hasNumber(1));
        assertTrue(this.pot.hasNumber(2));
        assertTrue(this.pot.hasNumber(3));
        assertTrue(this.pot.hasNumber(4));
        assertTrue(this.pot.hasNumber(5));
        assertTrue(this.pot.hasNumber(6));
        assertTrue(this.pot.hasNumber(7));
        assertTrue(this.pot.hasNumber(8));
        assertTrue(this.pot.hasNumber(9));

        assertFalse(this.pot.hasNumber(10));
        assertFalse(this.pot.hasNumber(-1));
    }

    @Test
    public void testPotIsFinite(){
        int n = this.pot.getNumber(1);
        assertFalse(this.pot.hasNumber(n));

        n = this.pot.getNumber(3);
        assertFalse(this.pot.hasNumber(n));

        n = this.pot.getNumber(5);
        assertFalse(this.pot.hasNumber(n));

        assertTrue(this.pot.hasNumber(8));
        assertTrue(this.pot.hasNumber(9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPotError(){
        this.pot.getNumber(1);
        this.pot.getNumber(1);
    }
}
