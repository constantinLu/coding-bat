/**
 *
 */
package Logic1;

/**
 * @author LunguC
 * When squirrels get together for a party, they like to have cigars.
 * A squirrel party is successful when the number of cigars is between 40 and 60,
 * inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars.
 * Return true if the party with the given values is successful, or false otherwise.
 */
public class cigarParty {
    /**
     * @param args
     */
    public static void main(String[] args) {
        cigarParty c = new cigarParty();
        System.out.println(c.cigarParty(30, false));


    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else return cigars >= 40 && cigars <= 60;
    }

}
