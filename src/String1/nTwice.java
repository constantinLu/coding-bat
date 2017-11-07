/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given a string and an int n,
 * return a string made of the first and last n chars from the string.
 * The string length will be at least n.
 */
public class nTwice {
    /**
     * @param args
     */
    public static void main(String[] args) {
        nTwice n = new nTwice();
        System.out.println(n.nTwice("Hello", 2));

    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

}
