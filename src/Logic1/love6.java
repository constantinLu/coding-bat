/**
 *
 */
package Logic1;

/**
 * @author lunguc
 */
public class love6 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        if ((a + b == 6) || (a - b == 6)) {
            return true;
        }
        return b - a == 6;
    }

}
