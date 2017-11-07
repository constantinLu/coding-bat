/**
 *
 */
package Array1;

import java.util.Arrays;

/**
 * @author LunguC
 * <p>
 * Given an array of ints length 3, figure out which is larger, the first or last element in the array,
 * and set all the other elements to be that value. Return the changed array.
 */
public class maxEnd3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        maxEnd3 m = new maxEnd3();
        System.out.println(Arrays.toString(m.maxEnd3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(m.maxEnd3(new int[]{11, 5, 9})));
        System.out.println(Arrays.toString(m.maxEnd3(new int[]{2, 11, 3})));


    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        int[] newAr = {max, max, max};
        return newAr;
    }

}
