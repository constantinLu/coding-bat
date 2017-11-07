/**
 *
 */
package WarmUp1;

/**
 * @author LunguC
 * <p>
 * Return true if the given string contains between 1 and 3 'e' chars.
 */
public class stringE {
    /**
     * @param args
     */
    public static void main(String[] args) {
        stringE e = new stringE();
        System.out.println(e.stringE("Hello"));
        System.out.println(e.stringE("Heelle"));
        System.out.println(e.stringE("Heelele"));


    }

    public boolean stringE(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e')
                count++;
        }
        return (count >= 1 && count <= 3);
    }

}
