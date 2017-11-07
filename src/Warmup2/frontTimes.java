/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * Given a string and a non-negative int n,
 * we'll say that the front of the string is the first 3 chars,
 * or whatever is there if the string is less than length 3.
 * Return n copies of the front;
 */
public class frontTimes {
    /**
     * @param args
     */
    public static void main(String[] args) {
        frontTimes s = new frontTimes();
        System.out.println(s.frontTimes("Chocolate", 2));
        System.out.println(s.frontTimes("Chocolate", 3));
        System.out.println(s.frontTimes("Abc", 5));
        System.out.println(s.frontTimes("Ab", 5));
    }

    public String frontTimes(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }

}
