/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string of even length,
 * return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
 */
public class middleTwo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        middleTwo two = new middleTwo();
        System.out.println(two.middleTwo("string"));

    }

    public String middleTwo(String str) {
        return str.substring((str.length() / 2) - 1, str.length() / 2 + 1);

    }

}
