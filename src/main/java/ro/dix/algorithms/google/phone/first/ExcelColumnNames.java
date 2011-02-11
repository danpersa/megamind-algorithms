package ro.dix.algorithms.google.phone.first;

/**
 *
 * @author dan
 */
public class ExcelColumnNames {

    public String getColumnName(int nr) {
        String s = "";
        do {
            char nrOfLetter = (char) (nr % 26);
            char c = (char) (64 + nrOfLetter);
            s = c + s;
            nr /= 26;
        } while (nr != 0);
        return s;
    }
}
