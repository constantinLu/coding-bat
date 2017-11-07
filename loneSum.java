package codingBath;

public class loneSum {

    public static void main(String[] args) {

        loneSum l = new loneSum();
        System.out.println(l.loneSum(1, 2, 3));
        System.out.println(l.loneSum(3, 2, 3));
        System.out.println(l.loneSum(3, 3, 3));
    }

    // Given 3 int values, a b c, return their sum. However,
    // if one of the values is the same as another of the values, it does not count towards the sum.
    public int loneSum(int a, int b, int c) {

        if (a == b && a == c && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (a == c) {
            return b;
        }
        if (b == c) {
            return a;
        }
        return a + b + c;

    }
}
