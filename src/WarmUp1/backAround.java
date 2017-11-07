/**
 *
 */
package WarmUp1;

/**
 * @author LunguC
 * Given a string, take the last char and return a new string with
 * the last char added at the front and back, so "cat" yields "tcatt".
 * The original string will be length 1 or more.
 */
public class backAround {
    /**
     * @param args
     */
    public static void main(String[] args) {
        backAround s = new backAround();
        String a = s.backAround("Catalin");
        System.out.println(a);
    }

    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        System.out.println(last);
        return last + str + last;

    }

}
