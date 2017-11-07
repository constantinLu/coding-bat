/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string of even length, return the first half.
 * So the string "WooHoo" yields "Woo".
 */
public class firstHalf {
    /**
     * @param args
     */
    public static void main(String[] args) {
        firstHalf fh = new firstHalf();
        System.out.println(fh.firstHalf("WooHoo"));

    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

}
