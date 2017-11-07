/**
 *
 */
package WarmUp1;

/**
 * @author lunguc
 * Given a string, return true if the string starts with "hi" and false otherwise.
 */
public class startHi {

    /**
     * @param args
     */
    public static void main(String[] args) {
        startHi h = new startHi();
        System.out.println(h.startHi("hi there"));
        System.out.println(h.startHi("hi"));
        System.out.println(h.startHi("hello hi"));

    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

}
