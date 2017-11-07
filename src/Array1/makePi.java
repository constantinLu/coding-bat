/**
 *
 */
package Array1;

import java.util.Arrays;

/**
 * @author LunguC
 * <p>
 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
 */
public class makePi {
    /**
     * @param args
     */
    public static void main(String[] args) {
        makePi mk = new makePi();
        System.out.println(Arrays.toString(mk.makePi()));

    }

    public int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }

}
