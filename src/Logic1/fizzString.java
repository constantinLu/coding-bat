/**
 *
 */
package Logic1;

/**
 * @author lunguc
 * Given a string str, if the string starts with "f" return "Fizz".
 * If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
 * In all other cases, return the string unchanged. (See also: FizzBuzz Code)
 */
public class fizzString {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        }
        if (str.startsWith("f")) {
            return "Fizz";
        }
        if (str.endsWith("b")) {
            return "Buzz";
        }


        return str;
    }

}
