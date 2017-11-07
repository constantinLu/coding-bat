/**
 *
 */
package Warmup2;

/**
 * @author LunguC
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
 * so "kittens" yields "kien".
 */
public class altPairs {
    /**
     * @param args
     */
    public static void main(String[] args) {
        altPairs ap = new altPairs();
        System.out.println(ap.altPairs("kitten"));
        System.out.println("kitten");
        System.out.println(ap.altPairs("Chocolate"));
        System.out.println("Chocolate");


    }

    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result += str.substring(i, end);
        }
        return result;
    }

}
