/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string,
 * return a new string made of 3 copies of the last 2 chars of the original string.
 * The string length will be at least 2.
 */
public class extraEnd {
    /**
     * @param args
     */
    public static void main(String[] args) {
        extraEnd extra = new extraEnd();
        System.out.println(extra.extraEnd("Hello"));

    }

    public String extraEnd(String str) {
        String ss1 = "";
        if (str.length() >= 2) {
            ss1 = (str.substring(str.length() - 2));
            ss1 += ss1 + ss1;

        }
        return ss1;
    }

}
