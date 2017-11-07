/**
 *
 */
package String1;

/**
 * @author LunguC
 * Given 2 strings, return their concatenation,
 * except omit the first char of each. The strings will be at least length 1.
 */
public class nonStart {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub


    }

    public String nonStart(String a, String b) {
        String result = a.substring(1) + b.substring(1);
        return result;
    }
}