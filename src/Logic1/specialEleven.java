/**
 *
 */
package Logic1;

/**
 * @author lunguc
 * <p>
 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
 * Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
 */
public class specialEleven {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

}
