/**
 *
 */
package WarmUp1;

/**
 * @author lunguc
 * <p>
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
 * so "kitten" yields"kikittenki".
 * If the string length is less than 2, use whatever chars are there.
 */
public class front22 {

    public static void main(String[] args) {
        front22 fr = new front22();
        System.out.println(fr.front221("kitten"));
        System.out.println(fr.front221("ha"));
        System.out.println(fr.front221("abc"));


    }

    public String front22(String str) {
        String front = "";
        if (str.length() < 2) {
            front = str + str + str;
        } else {
            front = str.substring(0, 2) + str + str.substring(0, 2);
        }
        return front;
    }

    /**
     * @param args
     */

    public String front221(String str) {
        //first figure the numers of char to take
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }

}
