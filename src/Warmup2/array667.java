/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * <p>
 * Given an array of ints, return the number of times that two 6's are next to each other in the array.
 * Also count instances where the second "6" is actually a 7.
 */
public class array667 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        array667 ar = new array667();
        System.out.print(ar.array667(new int[]{6, 6, 2}) + "\n");
        System.out.print(ar.array667(new int[]{6, 6, 2, 6}) + "\n");
        System.out.print(ar.array667(new int[]{6, 7, 2, 6}) + "\n");

    }

    public int array667(int[] nums) {
        int count = 0;

        for (int i = 0; i < (nums.length - 1); i++) {
            if (nums[i] == 6)
                if (nums[i + 1] == 6 || nums[i + 1] == 7)
                    count++;
        }
        return count;
    }

}
