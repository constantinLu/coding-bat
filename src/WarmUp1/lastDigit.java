/**
 *
 */
package WarmUp1;

/**
 * @author LunguC
 * <p>
 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod"
 * operator computes remainders, so 17 % 10 is 7.
 */
public class lastDigit {
    /**
     * @param args
     */
    public static void main(String[] args) {
        lastDigit d = new lastDigit();
        System.out.println(d.lastDigit(7, 17));
        System.out.println(d.lastDigit(6, 17));
        System.out.println(d.lastDigit(3, 113));

    }

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

}
