package WarmUp1;

public class diff21 {

    public static void main(String args[]) {
        diff21 d = new diff21();
        int s = d.diff21(50);
        System.out.println(s);
    }

    public int diff21(int n) {
        if (n <= 21) {
            return n - 1;
        } else {
            return (n - 21) * 2;
        }
    }
}
