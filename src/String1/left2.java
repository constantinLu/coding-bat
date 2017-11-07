/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
 * The string length will be at least 2.
 */
public class left2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String left2(String str) {
        if (str.length() >= 2) {
            return str.substring(2) + str.substring(0, 2);
        }
        return str;
    }

}
