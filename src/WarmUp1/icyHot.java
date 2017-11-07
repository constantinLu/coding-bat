/**
 *
 */
package WarmUp1;

/**
 * @author lunguc
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
 */
public class icyHot {
    /**
     * @param args
     */
    public static void main(String[] args) {
        icyHot c = new icyHot();
        System.out.println(c.icyHot(120, -1));
        System.out.println(c.icyHot(-1, 120));
        System.out.println(c.icyHot(2, 120));
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

}
