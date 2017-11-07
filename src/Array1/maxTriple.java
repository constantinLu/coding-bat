/**
 *
 */
package Array1;

/**
 * @author LunguC
 * <p>
 * Given an array of ints of odd length, look at the first, last,
 * and middle values in the array and return the largest. The array length will be a least 1.
 */
public class maxTriple {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int maxTriple(int[] nums) {
        int mid = nums[nums.length / 2];
        int first = nums[0];
        int last = nums[nums.length - 1];
        int st = Math.max(last, mid);
        int ls = Math.max(st, first);
        return ls;
    }

    /**
     * @param args
     */

    public int maxTriple1(int[] nums) {
        int max = nums[0];
        if (max <= nums[nums.length - 1])
            max = nums[nums.length - 1];
        if (max <= nums[nums.length / 2])
            max = nums[nums.length / 2];
        return max;
    }

}
