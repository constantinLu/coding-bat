/**
 *
 */
package Array1;

import java.util.Arrays;

/**
 * @author LunguC
 * Given 2 int arrays, a and b, each length 3,
 * return a new array length 2 containing their middle elements.
 */
public class middleWay {
    /**
     * @param args
     */
    public static void main(String[] args) {
        middleWay as = new middleWay();
        System.out.println(Arrays.toString(as.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(as.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0})));
        //System.out.println(as.middleWay(new int[] {5, 2, 9}, new int[] {1, 4, 5}));

    }

    public int[] middleWay(int[] a, int[] b) {
        return (new int[]{a[1], b[1]});

    }

}
