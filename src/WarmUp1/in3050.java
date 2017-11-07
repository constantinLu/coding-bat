/**
 *
 */
package WarmUp1;

/**
 * @author lunguc
 * Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
 */
public class in3050 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        in3050 s = new in3050();
        System.out.println(s.in3050(30, 31));
        System.out.println(s.in3050(30, 41));
        System.out.println(s.in3050(40, 50));

    }

    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 50) && (b >= 30 && b <= 50));
    }

}
