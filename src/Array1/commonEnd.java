/**
 *
 */
package Array1;

/**
 * @author LunguC
 * <p>
 * Given 2 arrays of ints, a and b, return true if they
 * have the same first element or they have the same last element.
 * Both arrays will be length 1 or more.
 */
public class commonEnd {
    /**
     * @param args
     */
    public static void main(String[] args) {
        commonEnd cm = new commonEnd();
        System.out.println(cm.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println(cm.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        System.out.println(cm.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
    }

    public boolean commonEnd(int[] a, int[] b) {
        return ((a.length >= 1 && b.length >= 1) && (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]));
    }

}
