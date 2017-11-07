/**
 *
 */
package String1;

/**
 * @author LunguC
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
 */
public class conCat {
    /**
     * @param args
     */
    public static void main(String[] args) {
        conCat con = new conCat();
        System.out.println(con.conCat("abc", "cat"));
        System.out.println(con.conCat("dog", "cat"));
        System.out.print(con.conCat("abc", ""));

    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        }
        if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a.substring(0, a.length() - 1) + b;
        }
        return a + b;
    }

}
