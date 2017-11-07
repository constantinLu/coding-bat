/**
 *
 */
package Array1;

/**
 * @author LunguC
 * <p>
 * Given an array of ints of odd length,
 * return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
 */
public class midThree {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int[] midThree(int[] nums) {
        int[] arr = new int[3];
        int mid = nums.length / 2;
        arr[0] = nums[mid - 1];
        arr[1] = nums[mid];
        arr[2] = nums[mid + 1];
        return arr;
    }

}
