/**
 *
 */
package Array1;

/**
 * @author LunguC
 * <p>
 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
 * Return the array which has the largest sum. In event of a tie, return a.
 */
public class biggerTwo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int[] biggerTwo(int[] a, int[] b) {
        int num1 = a[0] + a[1];
        int num2 = b[0] + b[1];
        //int[] sum1 = { a[0] + b[0], a[1] + b[1]};

        if (num1 == num2) {
            return a;
        }
        if (num1 > num2) {
            return a;
        } else {
            return b;
        }

    }

}
