/**
 *
 */
package WarmUp1;

/**
 * @author lunguc
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 2 int values, return true if one or the other is teen, but not both.
 */
public class loneTeen {
    /**
     * @param args
     */
    public static void main(String[] args) {
        loneTeen t = new loneTeen();
        System.out.println(t.IoneTeen(13, 99));
        System.out.println(t.IoneTeen(21, 19));
        System.out.println(t.IoneTeen(13, 13));
    }

    public boolean IoneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && !(b >= 13 && b <= 19)) {
            return true;
        } else return !(a >= 13 && a <= 19) && (b >= 13 && b <= 19);
    }

}
