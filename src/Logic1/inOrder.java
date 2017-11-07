/**
 *
 */
package Logic1;

/**
 * @author lunguc
 * Given three ints, a b c, return true if b is greater than a, and c is greater than b.
 * However, with the exception that if "bOk" is true, b does not need to be greater than a.
 */
public class inOrder {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return (b > a && c > b);
        }

    }

}
