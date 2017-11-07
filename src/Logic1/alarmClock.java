/**
 *
 */
package Logic1;

/**
 * @author lunguc
 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
 * return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
 * and on the weekend it should be "10:00".
 * Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
 */
public class alarmClock {
    /**
     * @param args
     */
    public static void main(String[] args) {
        alarmClock al = new alarmClock();
        System.out.println(al.alarmClock(1, false));
        System.out.println(al.alarmClock(5, false));
        System.out.println(al.alarmClock(0, true));
        System.out.println(al.alarmClock(6, false));
        System.out.println(al.alarmClock(6, true));
        System.out.println(al.alarmClock(5, true));

    }

    public String alarmClock(int day, boolean vacantion) {
        if (vacantion) {
            if (day == 0 || day == 6) {
                return "off";
            }
            return "10:00";
        } else {
            if (day == 0 || day == 6) {
                return "10:00";
            }
            return "7:00";
        }
    }

}
