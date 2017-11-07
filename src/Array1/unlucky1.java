/**
 *
 */
package Array1;

/**
 * @author LunguC
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
 * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
 */
public class unlucky1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        unlucky1 un = new unlucky1();
        System.out.println(un.unlucky1(new int[]{1, 3, 4, 5}));

    }

    public boolean unlucky1(int[] nums) {
        int[] ar = new int[4];
        ar[0] = nums[0];
        ar[1] = nums[1];
        ar[2] = nums[nums.length - 2];
        ar[3] = nums[nums.length - 1];
        for (int i = 0; i < ar.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3) {
                return true;

            }
        }
        return false;
    }

    boolean unlucky2(int[] nums) {
        int lastP = nums.length - 1;
        if (lastP >= 2) {
            if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3))
                return true;
            return (nums[lastP - 1] == 1 && nums[lastP] == 3);
        }
        if (lastP == 1)
            return ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3));
        return false;
    }

}
