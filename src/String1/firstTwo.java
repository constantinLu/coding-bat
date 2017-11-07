/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
 * If the string is shorter than length 2, return whatever there is,
 * so "_22staticMethod" yields "_22staticMethod", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
 */
public class firstTwo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String otherStr = str.substring(0, 2);
        return otherStr;
    }

}
