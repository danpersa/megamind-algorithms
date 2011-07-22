package ro.dix.algorithms.usaco.section1.first;


/*
ID: adelina1
LANG: JAVA
TASK: friday
 */
import java.io.*;
import java.util.*;

/**
 *
 * @author dan
 */
public class friday {

    private static int n;
    private static int[] result = new int[7];

    private static void read() throws FileNotFoundException, IOException {
        // Use BufferedReader rather than RandomAccessFile; it's much faster
        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        // Use StringTokenizer vs. readLine/split -- lots faster
        StringTokenizer st = new StringTokenizer(f.readLine());
        // Get line, break into tokens
        n = Integer.parseInt(st.nextToken());    // read n
    }

    private static int numberOfDaysInMonth(int month, int leap) {
        switch (month) {
            case 9:
            case 4:
            case 6:
            case 11:
                return 30;
            case 2:
                return 28 + leap;
            default:
                return 31;
        }

    }

    private static int nrOfDaysToNextThirteen(int month, int leap) {
        return numberOfDaysInMonth(month, leap);
    }

    public static void main(String[] args) throws IOException {
        read();
        int currentDayOfTheYear = 1;
        int numberOfDaysToNext13 = 13 - currentDayOfTheYear;
        int weekDay = 0;
        int currentMonth = 1;

        for (int year = 1900; year < 1900 + n; ++year) {
            // we check if the year is a leap year (366 days instead of 365)
            int leap = 0;
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = 1;
                }
            } else {
                if (year % 4 == 0) {
                    leap = 1;
                }
            }
            while (currentMonth <= 12) {
                currentDayOfTheYear += numberOfDaysToNext13;
                weekDay = (weekDay + numberOfDaysToNext13) % 7;
                result[weekDay]++;
                numberOfDaysToNext13 = nrOfDaysToNextThirteen(currentMonth, leap);
                currentMonth++;
            }
            currentDayOfTheYear = currentDayOfTheYear % (365 + leap);
            currentMonth = 1;
            numberOfDaysToNext13 = nrOfDaysToNextThirteen(12, leap);
        }

        write();
    }

    private static void write() throws IOException {
        // input file name goes above
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        out.print(result[5] + " ");
        out.print(result[6] + " ");
        for (int i = 0; i < 5; ++i) {
            out.print(result[i]);
            if (i != 4) {
                out.print(" ");
            }
        }
        out.println();
        out.close();                                  // close the output file
        System.exit(0);                               // don't omit this!
    }
}
