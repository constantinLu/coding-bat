/**
 *
 */
package WarmUp1;

/**
 * @author lunguc
 * Given three int values, a b c, return the largest.
 */
public class intMax {
    /**
     * @param args
     */
    public static void main(String[] args) {
        intMax s = new intMax();
        System.out.println(s.inMax(1, 2, 3));
        System.out.println(s.inMax(1, 3, 2));
        System.out.println(s.inMax(3, 2, 1));


    }

    public int inMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        //now chec betwween max and c;

        if (c > max) {
            max = c;
        }
        return max;
    }

}
