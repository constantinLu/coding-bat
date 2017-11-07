package WarmUp1;

public class makes10 {

    public static void main(String[] args) {
        makes10 m = new makes10();
        int a = 5;
        int b = 10;
        //m.makes10(a, b);
        System.out.println("The result is :" + m.makes10(a, b));
    }

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || (a + b) == 10;
    }

}
