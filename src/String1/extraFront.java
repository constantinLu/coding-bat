package String1;

/**
 * Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
 * The string may be any length. If there are fewer than 2 chars, use whatever is there.
 *
 * @author LunguC
 */
public class extraFront {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String extraFront(String str) {
        String res = "";
        if (str.length() >= 2) {
            res = str.substring(0, 2);
            res += res + res;
        } else {
            res = str + str + str;

        }
        return res;
    }

}
