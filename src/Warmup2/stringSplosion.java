/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * <p>
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 */
public class stringSplosion {
    /**
     * @param args
     */
    public static void main(String[] args) {
        stringSplosion ss = new stringSplosion();
        System.out.println(ss.stringSpolsion("Code"));
        //System.out.println(ss.stringSpolsion("abc"));
        //System.out.println(ss.stringSpolsion("ab"));
    }

    public String stringSpolsion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            // String res = str.substring(0, i + 1);
            //System.out.println(res);
            result += str.substring(0, i + 1);
        }
        return result;
    }

}
