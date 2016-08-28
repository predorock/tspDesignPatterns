package predo.exercises.get15;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by predo1 on 28/08/16.
 */
public class TestGet15Player {

    private Get15Pot pot;
    private Get15Player player1;


    @Before
    public void before(){
        pot = new Get15Pot();
        player1 = new Get15Player();
    }

    @Test
    public void testGet15PlayerNumbers(){
        this.player1.drawNumber(9);
        this.player1.drawNumber(6);
        assertFalse(this.player1.hasWin());

        this.player1.drawNumber(7);
        this.player1.drawNumber(2);
        assertTrue(this.player1.hasWin());
    }
}
