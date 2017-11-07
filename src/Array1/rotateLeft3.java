/**
 *
 */
package Array1;

import java.util.Arrays;

/**
 * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}
 *
 * @param args
 */
public class rotateLeft3 {
    public static void main(String[] args) {
        rotateLeft3 rt = new rotateLeft3();
        System.out.println((Arrays.toString(rt.rotateLeft3(new int[]{1, 2, 3}))));
        System.out.println((Arrays.toString(rt.rotateLeft3(new int[]{11, 9, 5}))));
        System.out.println(Arrays.toString((rt.rotateLeft3(new int[]{0, 0, 7}))));

    }

    public int[] rotateLeft3(int[] nums) {
        int[] rotated = {nums[1], nums[2], nums[0]};
        return rotated;
    }

}
