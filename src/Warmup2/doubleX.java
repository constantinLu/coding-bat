/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * <p>
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 */
public class doubleX {
    /**
     * @param args
     */
    public static void main(String[] args) {
        doubleX d = new doubleX();
        System.out.println(d.doubleX("axxbb"));
        System.out.println(d.doubleX("axaxaxa"));
        System.out.println(d.doubleX("xxxxxx"));

    }

    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        String x = str.substring(i);
        return x.startsWith("xx");
    }

}
