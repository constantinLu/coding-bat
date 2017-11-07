/**
 *
 */
package Array1;

/**
 * @author LunguC
 * Given an array of ints of even length,
 * return a new array length 2 containing the middle two elements from the original array.
 * The original array will be length 2 or more.
 */
public class makeMiddle {
    /**
     * @param args
     */
    public static void main(String[] args) {


    }

    public int[] makeMiddle(int[] nums) {
        int[] middle = new int[2];
        int half = nums.length / 2;
        middle[0] = nums[half - 1];
        middle[1] = nums[half];

        return middle;
    }

}
