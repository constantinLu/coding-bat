/**
 *
 */
package WarmUp1;

/**
 * @author lunguc
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 */
public class mixStart {
    /**
     * @param args
     */
    public static void main(String[] args) {
        mixStart s = new mixStart();
        System.out.println(s.mixStart("mix snacks"));
        System.out.println(s.mixStart("pix snacks"));
        System.out.println(s.mixStart("piz snacks"));
        System.out.println(s.mixStart("pix"));

    }

    public boolean mixStart(String str) {
        return str.length() >= 3 && str.startsWith("ix", 1);
    }

}
