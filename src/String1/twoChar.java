/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string and an index, return a string length 2 starting at the given index.
 * If the index is too big or too small to define a string length 2, use the first 2 chars.
 * The string length will be at least 2.
 */
public class twoChar {
    /**
     * @param args
     */
    public static void main(String[] args) {
        twoChar ch = new twoChar();
        System.out.println(ch.twoChar("java", 3));
        System.out.println(ch.twoChar("java", -1));

    }

    public String twoChar(String str, int index) {
        if (index <= str.length() - 2 && index >= 0) {
            return str.substring(index, index + 2);
        }
        return str.substring(0, 2);
    }

}
