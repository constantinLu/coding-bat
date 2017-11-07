/**
 *
 */
package Array1;

/**
 * @author LunguC
 * Given an int array of any length, return a new array of its first 2 elements.
 * If the array is smaller than length 2, use whatever elements are present.
 */
public class frontPiece {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int[] frontPiece(int[] nums) {
        int[] n;
        if (nums.length >= 2) {
            n = new int[2];
            n[0] = nums[0];
            n[1] = nums[1];
        } else if (nums.length == 1) {
            n = new int[1];
            n[0] = nums[0];
        } else {
            n = new int[0];
        }
        return n;
    }

}
