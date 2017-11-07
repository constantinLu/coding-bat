/**
 *
 */
package Array1;

/**
 * @author LunguC
 * Given an array of ints, return true if the array is length 1 or more,
 * and the first element and the last element are equal.
 */
public class sameFirstLast {
    /**
     * @param args
     */
    public static void main(String[] args) {
        sameFirstLast fl = new sameFirstLast();
        System.out.println(fl.sameFirstLast(new int[]{1, 2, 3}));
        System.out.println(fl.sameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println(fl.sameFirstLast(new int[]{1, 2, 1}));

    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

}
