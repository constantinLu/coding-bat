/**
 *
 */
package Array1;

/**
 * @author LunguC
 * <p>
 * Given an array of ints, return true if 6 appears as either the first or last element in the array.
 * The array will be length 1 or more.
 */
public class firstLast6 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        firstLast6 fl = new firstLast6();
        System.out.println(fl.firstLast6(new int[]{1, 2, 6}));
        System.out.println(fl.firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(fl.firstLast6(new int[]{13, 6, 1, 2, 3}));

    }

    public boolean firstLast6(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int first = nums[0];
            int last = nums[nums.length - 1];
            System.out.println(first);
            System.out.println(last);
            if (first == 6 || last == 6) {
                return true;
            }
        }
        return false;
    }

}
