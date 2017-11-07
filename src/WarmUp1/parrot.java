package WarmUp1;

public class parrot {
    public static void main(String args[]) {

        parrot p = new parrot();
        boolean a = p.parrotTrouble(true, 6);
        boolean a1 = p.parrotTrouble(true, 7);
        boolean a2 = p.parrotTrouble(false, 6);
        System.out.println(a + "\n" + a1 + "\n" + a2);
    }

    public boolean parrotTrouble(boolean talking, int hour) {

        if (hour < 7 || hour > 20) {
            return talking;
        }

        return false;

    }
}