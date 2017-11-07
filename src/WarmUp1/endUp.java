/**
 *
 */
package WarmUp1;

/**
 * @author LunguC
 * <p>
 * Given a string, return a new string where the last 3 chars are now in upper case.
 * If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
 */
class endUp {
    public static void main(String[] args) {
        endUp e = new endUp();
        System.out.println(e.endUp("Hello"));
        System.out.println(e.endUp("hi thERE"));
        System.out.println(e.endUp("HI"));


    }

    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);

        return front + back.toUpperCase();
    }

}
