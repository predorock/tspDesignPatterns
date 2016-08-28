package predo.exercises.get15;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by predo1 on 28/08/16.
 */
public class TestGame15Game {

    private Get15Player player1;
    private Get15Player player2;
    private Get15Pot pot;

    @Before
    public void before(){
        player1 = new Get15Player();
        player2 = new Get15Player();
        pot = new Get15Pot();
    }

    @Test
    public void testSimpleGame(){
        player1.drawNumber(pot.getNumber(1));
        player2.drawNumber(pot.getNumber(6));

        player1.drawNumber(pot.getNumber(5));
        player2.drawNumber(pot.getNumber(9));

        player1.drawNumber(pot.getNumber(3));
        player2.drawNumber(pot.getNumber(7));

        assertFalse(player1.hasWin());
        assertFalse(player2.hasWin());

        player1.drawNumber(pot.getNumber(8));
        player2.drawNumber(pot.getNumber(2));

        assertFalse(player1.hasWin());
        assertTrue(player2.hasWin());
    }
}
