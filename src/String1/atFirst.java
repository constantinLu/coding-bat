/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string, return a string length 2 made of its first 2 chars.
 * If the string length is less than 2, use '@' for the missing chars.
 */
public class atFirst {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String atFirst(String str) {
        if (str.length() == 1) {
            return str.concat("@");
        }
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return "@@";
        }

    }

}
