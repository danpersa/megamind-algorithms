/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.dix.algorithms.game;

import ro.dix.algorithms.game.TicTacToeEncoded;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dix
 */
public class TicTacToeEncodedTest {

    /**
     * Test of isWon method, of class TicTacToeEncoded.
     */
    @Test
    public void testIsWon() {
        System.out.println("isWon");
        byte row1 = Byte.parseByte("111111", 2);
        byte row2 = 0;
        byte row3 = 0;
        boolean isX = true;
        TicTacToeEncoded instance = new TicTacToeEncoded();
        boolean expResult = true;
        boolean result = instance.isWon(row1, row2, row3, isX);
        assertEquals(expResult, result);


        row1 = Byte.parseByte("110000", 2);
        row2 = Byte.parseByte("110000", 2);;
        row3 = Byte.parseByte("110000", 2);;
        isX = true;
        instance = new TicTacToeEncoded();
        expResult = true;
        result = instance.isWon(row1, row2, row3, isX);
        assertEquals(expResult, result);
    }
}
