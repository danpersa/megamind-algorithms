package ro.dix.algorithms.number;

/**
 *
 * @author dan
 */
public class DivisionWithoutDivide {

    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (divisor == 0) {
            throw new ArithmeticException("Division by 0");
        }
        int sign = 1;
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            sign = -1;
        }
        int q = 0;
        while (dividend > 0) {
            dividend -= divisor;
            q++;
        }
        return sign * q;
    }
}
