package WarmUp1;

public class nearHundred {
    public static void main(String[] args) {
        nearHundred n = new nearHundred();
        boolean a = n.nearHundred(1000);
        System.out.println(a);

    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

}
