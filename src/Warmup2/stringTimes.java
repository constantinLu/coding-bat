/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 */
public class stringTimes {
    /**
     * @param args
     */
    public static void main(String[] args) {
        stringTimes st = new stringTimes();
        System.out.println(st.stringTimes("Hi", 2));
        System.out.println(st.stringTimes("Hi", 3));
        System.out.println(st.stringTimes("Hi", 1));

    }

    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

}
