/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string, if one or both of the first 2 chars is 'x',
 * return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
 */
public class withoutX2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String withoutX2(String str) {

        if (str.startsWith("xx")) {
            return str.substring(2);

        }
        if (str.startsWith("x")) {
            return str.substring(1);
        }
        if (str.charAt(1) == 'x') {
            return str.substring(0, 1) + str.substring(2);
        }
        return str;
    }

}
