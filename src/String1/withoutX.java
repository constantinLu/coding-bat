/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
 * and otherwise return the string unchanged.
 */
public class withoutX {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String withoutX(String str) {
        if (str.startsWith("x") && str.endsWith("x")) {
            return str.substring(1, str.length() - 1);
        }
        if (str.startsWith("x")) {
            return str.substring(1);
        }

        if (str.endsWith("x")) {
            return str.substring(0, str.length() - 1);
        }
        if (str.length() == 0) {
            return "";
        }
        return str;
    }

}
