/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string of odd length,
 * return the string length 3 from its middle, so "Candy" yields "and".
 * The string length will be at least 3.
 */
public class middleThree {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String middleThree(String str) {
        return str.substring((str.length() / 2 - 1), (str.length() / 2 + 2));
    }

}
