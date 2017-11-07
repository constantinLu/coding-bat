/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * <p>
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 */
public class stringBits {
    /**
     * @param args
     */
    public static void main(String[] args) {
        stringBits sb = new stringBits();
        System.out.println(sb.stringBits("Hello"));
    }

    public String stringBits(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i = i + 2) {
            res += str.substring(i, i + 1);
        }
        return res;
    }

}
