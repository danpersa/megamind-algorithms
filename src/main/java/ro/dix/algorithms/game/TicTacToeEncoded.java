package ro.dix.algorithms.game;

/**
 *
 * @author dix
 */
public class TicTacToeEncoded {

    public boolean isWon(byte row1, byte row2, byte row3, boolean isX) {

        if (isX) {
            System.out.println("isX");
            System.out.println("row1validate: " + (row1 & Byte.parseByte("111111", 2)));
            System.out.println("rowvalidate: " + (row2 & Byte.parseByte("111111", 2)));
            System.out.println("row1validate: " + (row3 & Byte.parseByte("111111", 2)));
            if (
                    ((row1 ^ Byte.parseByte("111111", 2)) == 0)
                    || ((row2 ^ Byte.parseByte("111111", 2)) == 0)
                    || ((row3 ^ Byte.parseByte("111111", 2)) == 0)
                    || (
                    (row1 ^ Byte.parseByte("110000", 2)) == 0 &&
                    (row2 ^ Byte.parseByte("110000", 2)) == 0 &&
                    (row3 ^ Byte.parseByte("110000", 2)) == 0
                    )
               ) {
                return true;
            }
        }
        return false;
    }
}
