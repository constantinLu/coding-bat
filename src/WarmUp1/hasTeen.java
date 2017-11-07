package WarmUp1;

public class hasTeen {
    public static void main(String[] args) {
        hasTeen h = new hasTeen();
        System.out.println(h.hasTeen(13, 20, 10));
        System.out.println(h.hasTeen(12, 9, 20));
        System.out.println(h.hasTeen(12, 20, 19));

    }

    public boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19) {
            return true;
        } else if (b >= 13 && b <= 19) {
            return true;
        } else if (c >= 13 && c <= 19) {
            return true;
        }
        return false;
    }

}
