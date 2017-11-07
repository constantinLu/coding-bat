/**
 *
 */
package Array1;

/**
 * @author LunguC
 * Given an array of ints length 3, return the sum of all the elements.
 */
public class sum3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        sum3 s = new sum3();
        System.out.println(s.sum3(new int[]{1, 2, 3}));
        System.out.println(s.sum3(new int[]{5, 11, 2}));
        System.out.println(s.sum3(new int[]{7, 0, 0}));

    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

}
