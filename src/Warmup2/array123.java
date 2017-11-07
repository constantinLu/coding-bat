/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 */
public class array123 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        array123 ar = new array123();
        System.out.println(ar.array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(ar.array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(ar.array123(new int[]{1, 1, 2, 1, 2, 3}));
    }

    public boolean array123(int[] nums) {
        // interate over the fist 4  by length - 2;
        System.out.println(nums.length - 2);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

}
