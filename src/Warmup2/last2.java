/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * Given a string, return the count of the number of times
 * that a substring length 2 appears in the string and also as the last 2
 * chars of the string, so "hixxxhi" yields 1
 * (we won't count the end substring).
 */
public class last2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        last2 l = new last2();
        System.out.println(l.last2("hixxhi"));
        System.out.println(l.last2("xaxxaxaxx"));
        System.out.println(l.last2("axxxaaxx"));

    }

    public int last2(String str) {
        // screen out too-short string case.
        if (str.length() < 2)
            return 0;
        String end = str.substring(str.length() - 2);
        //System.out.println(str.length() -2 );
        int count = 0;

        //check each substring length 2 starting at i;

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }

}
