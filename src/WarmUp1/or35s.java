package WarmUp1;

/**
 * return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 * use the % mod
 *
 * @author lunguc
 */
public class or35s {
    public static void main(String args[]) {
        or35s o = new or35s();
        System.out.println(o.or35(3));
        System.out.println(o.or35(10));
        System.out.println(o.or35(8));
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
