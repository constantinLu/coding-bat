/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
 */
public class lastTwo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        lastTwo tw = new lastTwo();
        System.out.println(tw.lastTwo("coding"));
        System.out.println(tw.lastTwo("cat"));
        System.out.println(tw.lastTwo("ab"));

    }

    public String lastTwo(String str) {
        if (str.length() > 1) {
            return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        }
        return str;
    }

}
