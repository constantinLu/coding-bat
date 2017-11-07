/**
 *
 */
package WarmUp1;

/**
 * @author lunguc
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 */
public class in1020 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        in1020 a = new in1020();
        System.out.println(a.in1020(12, 99));
        System.out.println(a.in1020(21, 12));
        System.out.println(a.in1020(8, 99));
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) ||
                (b >= 10 && b <= 20);
    }

}
