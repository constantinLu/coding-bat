/**
 *
 */
package String1;

/**
 * @author LunguC
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
 * The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 */
public class hasBad {
    /**
     * @param args
     */
    public static void main(String[] args) {
        hasBad h = new hasBad();
        System.out.println(h.hasBad("baddxx"));
        System.out.println(h.hasBad("xbaddxx"));
        System.out.println(h.hasBad("xba"));
        System.out.println(h.hasBad("bad"));

    }

    public boolean hasBad(String str) {
        if ((str.length() == 3 && str.startsWith("bad")) || str.length() >= 4) {
            return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
        }
        return false;
    }

}
