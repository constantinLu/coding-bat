/**
 *
 */
package WarmUp1;

/**
 * @author LunguC
 * Given a non-empty string and an int n,
 * return a new string where the char at index n has been removed.
 * The value of n will be a valid index of a char in the original string
 * (i.e. n will be in the range 0..str.length()-1 inclusive).
 */
// example : Catalin  =  front = ca  = back = talin

// using the Java API and the method subString from String class;
public class missingChar {
    /**
     * @param args creating a missingChar object;
     */
    public static void main(String[] args) {
        missingChar n = new missingChar();
        String a = n.missingChar("Catalin", 2);
        System.out.println(a);

    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        System.out.println(front);
        String back = str.substring(n + 2, str.length());
        System.out.println(back);

        return front + back;
    }

}
