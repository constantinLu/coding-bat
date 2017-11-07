/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * Given an array of ints, return the number of 9's in the array.
 */
public class arrayCount9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        arrayCount9 ar = new arrayCount9();
        System.out.println(ar.arrayCount9(new int[]{1, 2, 9}));
        System.out.println(ar.arrayCount9(new int[]{1, 9, 9}));
        System.out.println(ar.arrayCount9(new int[]{1, 9, 9, 3, 9}));


    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

}
