package codingBath;

public class luckySum {
// Given 3 int values, a b c, return their sum. However,
// if one of the values is 13 then it does not count towards the sum and values to its right do not count.
// So for example, if b is 13, then both b and c do not count.


    public static void main(String[] args) {
        luckySum l = new luckySum();
        System.out.println(l.luckySum(1, 2, 3));
        System.out.println(l.luckySum(1, 2, 13));
        System.out.println(l.luckySum(1, 13, 3));
    }

    public int luckySum(int a, int b, int c) {

        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;

    }
}
