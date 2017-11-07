/**
 *
 */
package WarmUp1;

/**
 * @author LunguC
 * Given two int values, return their sum.
 * Unless the two values are the same, then return double their sum
 */
public class SumDouble {
    /**
     * @param args
     */
    public static void main(String[] args) {
        SumDouble s = new SumDouble();
        int a = s.sumDouble(0, 3);
        System.out.println(a);

    }

    public int sumDouble(int a, int b) {
        int sum = 0;
        if (a == b) {
            sum = (a + b) * 2;
        } else {
            sum = a + b;
        }
        return sum;
    }

}
