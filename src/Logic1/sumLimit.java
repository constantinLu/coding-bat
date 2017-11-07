/**
 *
 */
package Logic1;

/**
 * @author lunguc
 * Given 2 non-negative ints, a and b,
 * return their sum, so long as the sum has the same number of digits as a.
 * If the sum has more digits than a, just return a without b.
 * (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n)
 * and then check the length of the string.)
 */
public class sumLimit {
    /**
     * @param args
     */
    public static void main(String[] args) {
        sumLimit sm = new sumLimit();
        System.out.println(sm.sumLimit(2, 3));
        System.out.println(sm.sumLimit(8, 3));
        System.out.println(sm.sumLimit(12, 1));
        System.out.println(sm.sumLimit(11, 39));
        System.out.println(sm.sumLimit(0, 44));


    }

    public int sumLimit(int a, int b) {
        int sum = a + b;
        String aStr = String.valueOf(a);
        String sStr = String.valueOf(sum);
        return sStr.length() > aStr.length() ? a : sum;
    }

}
