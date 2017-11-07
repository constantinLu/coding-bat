/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string,
 * return a version without both the first and last char of the string.
 * The string may be any length, including 0.
 */
public class withoutEnd2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String withoutEnd2(String str) {
        return str.substring(1, str.length() - 1);
    }

}
