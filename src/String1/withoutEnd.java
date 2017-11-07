package String1;

/**
 * @author LunguC
 * <p>
 * Given a string, return a version without the first and last char, so "Hello" yields "ell".
 * The string length will be at least 2.
 */
public class withoutEnd {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

}
