/**
 *
 */
package Array1;

/**
 * @author LunguC
 * Given an array of ints, return the sum of the first 2 elements in the array.
 * If the array length is less than 2,
 * just sum up the elements that exist, returning 0 if the array is length 0.
 */
public class sum2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        sum2 s = new sum2();
        System.out.println(s.sum2(new int[]{1, 2, 3}));

    }

    public int sum2(int[] nums) {
        if (nums.length >= 2)
            return (nums[0] + nums[1]);
        if (nums.length == 1) {
            return nums[0];
        }
        return 0;
    }

}
