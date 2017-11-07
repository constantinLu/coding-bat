/**
 *
 */
package WarmUp1;

/**
 * @author lunguc
 * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
 * Note that Math.abs(n) returns the absolute value of a number.
 */
public class close10 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        close10 c = new close10();
        System.out.println(c.close10(8, 13));
        System.out.println(c.close10(13, 8));
        System.out.println(c.close10(13, 7));
    }

    public int close10(int a, int b) {

        int aDiff = Math.abs(10 - a);
        int bDiff = Math.abs(10 - b);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

}
