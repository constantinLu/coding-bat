package WarmUp1;

public class sleepIn {
    public static void main(String args[]) {
        sleepIn s = new sleepIn();

        s.sleepIn(false, false);
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;

    }

}
