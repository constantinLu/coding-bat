/**
 *
 */
package Logic1;

/**
 * @author lunguc
 * <p>
 * Return true if the given non-negative number is a multiple of 3 or 5, but not both.
 * Use the % "mod" operator -- see Introduction to Mod
 */
public class old35 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        } else if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }

        return false;
    }
}