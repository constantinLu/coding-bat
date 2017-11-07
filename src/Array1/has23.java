/**
 *
 */
package Array1;

/**
 * @author LunguC
 * Given an int array length 2, return true if it contains a 2 or a 3.
 */
public class has23 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean has23(int[] nums) {
        for (int i : nums) {
            if (i == 3 || i == 2) {
                return true;
            }
        }
        return false;
    }

}
