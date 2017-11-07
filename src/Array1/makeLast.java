/**
 *
 */
package Array1;

import java.util.Arrays;

/**
 * @author LunguC
 * <p>
 * Given an int array, return a new array with double
 * the length where its last element is the same as the original array, and all the other elements are 0.
 * The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
 */
public class makeLast {
    /**
     * @param args
     */
    public static void main(String[] args) {
        makeLast ml = new makeLast();
        System.out.println(Arrays.toString(ml.makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(ml.makeLast(new int[]{4, 5, 6})));

    }

    public int[] makeLast(int[] nums) {
        int len = nums.length * 2;
        int[] newArray = new int[len];
        newArray[len - 1] = nums[nums.length - 1];
        return newArray;
    }

}
