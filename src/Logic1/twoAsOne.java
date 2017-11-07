/**
 *
 */
package Logic1;

/**
 * @author lunguc
 * <p>
 * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
 */
public class twoAsOne {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public boolean twoAsOne(int a, int b, int c) {
        return ((a + b == c) || (a + c == b) || (b + c == a));
    }

}
