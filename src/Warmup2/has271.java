/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * <p>
 * Given an array of ints, return true if it contains a 2, 7, 1
 * pattern: a value, followed by the value plus 5, followed by the value minus 1.
 * Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
 */
public class has271 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        has271 hs = new has271();
        System.out.println(hs.has271(new int[]{1, 2, 7, 1}));
        System.out.println(hs.has271(new int[]{1, 2, 8, 1}));
        System.out.println(hs.has271(new int[]{2, 7, 1}));
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            int vals = nums[i];
            System.out.println(vals);
            if (nums[i + 1] == (vals + 5) && Math.abs(nums[i + 2] - (vals - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }

}
