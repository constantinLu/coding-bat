/**
 *
 */
package WarmUp1;

/**
 * @author lunguc
 * <p>
 * Given a string, we'll say that the front is the first 3 chars of the string.
 * If the string length is less than 3, the front is whatever is there.
 * Return a new string which is 3 copies of the front.
 */
public class front3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        front3 fr = new front3();
        System.out.println(fr.front3("Java"));
        System.out.println(fr.front3("Chocolate"));
        System.out.println(fr.front3("abc"));
    }

    public String front3(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        return front + front + front;
    }

}
