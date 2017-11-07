/**
 *
 */
package String1;

/**
 * @author LunguC
 * <p>
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
 * So "Hello" and "Hi" yield "loHi". The strings may be any length.
 */
public class minCat {
    /**
     * @param args
     */
    public static void main(String[] args) {
        minCat m = new minCat();
        System.out.println(m.minCat("Hello", "Hi"));
        System.out.println(m.minCat("Hello", "Java"));
        System.out.println(m.minCat("Java", "Hello"));

    }

    public String minCat(String a, String b) {
        int min = Math.min(a.length(), b.length());

        String abc = a.substring(a.length() - min) + b.substring(b.length() - min);
        //System.out.print(a.length() - 2);
        return abc;
    }

}
