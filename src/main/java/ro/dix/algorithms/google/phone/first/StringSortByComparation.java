package ro.dix.algorithms.google.phone.first;

/**
 *
 * @author dan
 */
public class StringSortByComparation {

    public String sort(String target, String source) {
        String finalString = "";
        int[] b = new int[source.length()];
        for (int i = 0; i < target.length(); ++i) {
            String c = finalString.substring(i, i + 1);
            if (!source.contains(c)) {
                finalString += c;
            } else {
                b[i]++;
            }
        }
        for (int i = source.length() - 1; i >= 0; --i) {
            for (int j = 0; j < b[i]; ++j) {
                finalString = source.charAt(i) + finalString;
            }
        }
        return finalString;
    }
}
