/**
 *
 */
package Logic1;

/**
 * @author lunguc
 * <p>
 * Given 2 ints, a and b, return their sum.
 * However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
 */
public class sortaSum {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            sum = 20;
        }
        return sum;

    }

}
