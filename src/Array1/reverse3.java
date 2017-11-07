/**
 *
 */
package Array1;

import java.util.Arrays;

/**
 * @author LunguC
 * <p>
 * Given an array of ints length 3,
 * return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}
 */
public class reverse3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        reverse3 rv = new reverse3();
        System.out.println(Arrays.toString(rv.reverse3(new int[]{1, 2, 3})));

    }

    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

}
