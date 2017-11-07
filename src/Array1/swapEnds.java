/**
 *
 */
package Array1;

import java.util.Arrays;

/**
 * @author LunguC
 * <p>
 * Given an array of ints, swap the first and last elements in the array.
 * Return the modified array. The array length will be at least 1.
 */
public class swapEnds {
    /**
     * @param args
     */
    public static void main(String[] args) {
        swapEnds s = new swapEnds();
        System.out.println(Arrays.toString(s.swapEnds(new int[]{1, 2, 3, 4})));

    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

}
