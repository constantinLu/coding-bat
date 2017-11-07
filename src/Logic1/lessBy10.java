/**
 *
 */
package Logic1;

/**
 * @author lunguc
 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
 */
public class lessBy10 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10);
    }

}
