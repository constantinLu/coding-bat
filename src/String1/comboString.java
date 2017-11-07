/**
 *
 */
package String1;

/**
 * @author LunguC
 * Given 2 strings, a and b, return a string of the form short+long+short,
 * with the shorter string on the outside and the longer string on the inside.
 * The strings will not be the same length, but they may be empty (length 0).
 */
public class comboString {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        }
        if (b.length() > a.length()) {
            return a + b + a;
        } else {
            return null;
        }
    }

}
