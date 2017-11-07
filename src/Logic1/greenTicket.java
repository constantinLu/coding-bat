/**
 *
 */
package Logic1;

/**
 * You have a green lottery ticket, with ints a, b, and c on it.
 * If the numbers are all different from each other, the result is 0.
 * If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.
 *
 * @author lunguc
 */
public class greenTicket {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && a == c && b == c) {
            return 20;
        }
        if (a != b && a != c && b != c) {
            return 0;
        }
        return 10;
    }

}
