/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * <p>
 * Suppose the string "yak" is unlucky.
 * Given a string, return a version where all the "yak" are removed,
 * but the "a" can be any char. The "yak" strings will not overlap.
 */
public class stringYak {
    /**
     * @param args
     */
    public static void main(String[] args) {
        stringYak sp = new stringYak();
        System.out.println(sp.stringYak("yakpak"));
        System.out.println(sp.stringYak("pakyak"));
        System.out.println(sp.stringYak("yak123ya"));
    }

    public String stringYak(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;

            } else {
                result += str.charAt(i);


            }
        }
        return result;
    }

}
