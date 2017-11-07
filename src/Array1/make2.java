package Array1;

/**
 * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
 * the elements from a followed by the elements from b. The arrays may be any length,
 * including 0, but there will be 2 or more elements available between the 2 arrays.
 *
 * @author LunguC
 */
public class make2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int[] make2(int[] a, int[] b) {
        int[] newArr = new int[2];
        if (a.length >= 2) {
            newArr[0] = a[0];
            newArr[1] = a[1];
        } else if (a.length == 1) {
            newArr[0] = a[0];
            newArr[1] = b[0];
        } else {
            newArr = b;
        }
        return newArr;

    }

}
