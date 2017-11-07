/**
 *
 */
package Array1;

import java.util.Arrays;

/**
 * @author LunguC
 * Given an int array length 3,
 * if there is a 2 in the array immediately followed by a 3,
 * set the 3 element to 0. Return the changed array.
 */
public class fix23 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        fix23 f = new fix23();
        System.out.println(Arrays.toString(f.fix23(new int[]{1, 2, 3})));

    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

}
