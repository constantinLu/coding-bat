/**
 *
 */
package WarmUp1;

/**
 * @author lunguc
 * <p>
 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
 * Otherwise, return the string unchanged.
 */
public class delDel {
    /**
     * @param args
     */
    public static void main(String[] args) {
        delDel d = new delDel();
        System.out.println(d.delDel("adelbc"));
        System.out.println(d.delDel("adelHello"));
        System.out.println(d.delDel("adedbc"));
        System.out.println(d.delDel("adc"));

    }

    public String delDel(String str) {
        String st = "";
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            st = str.substring(0, 1) + str.substring(4);
            return st;
        }
        return str;
    }

}
