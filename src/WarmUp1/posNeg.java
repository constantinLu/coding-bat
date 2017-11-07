package WarmUp1;

public class posNeg {
    public static void main(String[] args) {

        posNeg p = new posNeg();
        boolean b = p.posNeg(1, -1, false);
        boolean b2 = p.posNeg(-1, 1, false);
        boolean b3 = p.posNeg(-4, -5, true);
        System.out.println(b + " " + b2 + " " + b3);

    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return (a < 0 && b > 0 || a > 0 && b < 0);
        }
    }

}
