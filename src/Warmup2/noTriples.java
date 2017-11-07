package Warmup2;

/**
 * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
 * Return true if the array does not contain any triples.
 *
 * @author LunguC
 */
public class noTriples {
    public static void main(String[] args) {
        noTriples no = new noTriples();
        System.out.println(no.noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(no.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(no.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == nums[i] && nums[i + 1] == nums[i] && nums[i + 2] == nums[i]) {
                return false;
            }

        }
        return true;
    }

}
