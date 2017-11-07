/**
 *
 */
package String1;

/**
 * @author LunguC
 * Given a string,
 * if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
 */
public class seeColor {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }
        return "";

    }

}
