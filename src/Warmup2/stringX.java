/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * <p>
 * Given a string, return a version where all the "x" have been removed.
 * Except an "x" at the very start or end should not be removed.
 */
public class stringX {
    /**
     * @param args
     */
    public static void main(String[] args) {
        stringX x = new stringX();
        System.out.println(x.stringX("xHix"));
        System.out.println(x.stringX("abcd"));
        System.out.println(x.stringX("xabcdx"));

    }

    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                result += str.substring(i, i + 1);
            }
        }

        return result;

    }

}
