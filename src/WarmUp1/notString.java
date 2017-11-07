package WarmUp1;

public class notString {

    public static void main(String[] args) {
        notString n = new notString();
        System.out.println(n.notString("Miami"));
        System.out.println(n.notString("x"));

    }

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        } else {
            String s = "not";
            str = s + str;
            return str;

        }
    }

}
