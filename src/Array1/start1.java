/**
 *
 */
package Array1;

/**
 * @author LunguC
 * <p>
 * Start with 2 int arrays, a and b, of any length.
 * Return how many of the arrays have 1 as their first element.
 */
public class start1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        start1 s = new start1();
        System.out.println(s.start1(new int[]{1, 2, 3}, new int[]{1, 3}));

    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length >= 1 && a[0] == 1) {
            count += 1;
        }
        if (b.length >= 1 && b[0] == 1) {
            count += 1;
        }
        return count;
    }

}
