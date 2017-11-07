package Array1;

/**
 * @author LunguC
 * <p>
 * Given 2 int arrays, a and b, of any length,
 * return a new array with the first element of each array.
 * If either array is length 0, ignore that array.
 */
public class front11 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public int[] front11(int[] a, int[] b) {
        int[] arr;
        if (a.length >= 1) {
            if (b.length >= 1) {
                arr = new int[2];
                arr[0] = a[0];
                arr[1] = b[0];
            } else {
                arr = new int[1];
                arr[0] = a[0];
            }
        } else if (b.length >= 1) {
            arr = new int[1];
            arr[0] = b[0];

        } else {
            arr = new int[0];
        }
        return arr;
    }

}
