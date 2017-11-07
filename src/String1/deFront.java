/**
 *
 */
package String1;

/**
 * @author LunguC
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 * The string may be any length. Harder than it looks.
 */
public class deFront {
    /**
     * @param args
     */
    public static void main(String[] args) {
        deFront d = new deFront();
        System.out.println(d.deFront("Hello"));
        System.out.println(d.deFront("java"));
        System.out.println(d.deFront("away"));

    }

    public String deFront(String str) {
        if (str.charAt(0) != 'a' && str.charAt(1) != 'b') {
            return str.substring(2);
        } else if (str.charAt(0) != 'a') {
            return str.substring(1);
        } else if (str.charAt(1) != 'b') {
            return 'a' + str.substring(2);
        }
        return str;
    }

}
