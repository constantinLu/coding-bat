/**
 *
 */
package String1;

/**
 * @author LunguC
 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
 * The string length will be at least 2.
 */
public class right2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String right2(String str) {
        if (str.length() >= 2) {
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        }
        return str;
    }

}
