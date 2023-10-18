/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Clock {
    private static final int HOURSPERDAY = 24, MINUTESPERDAY = 60;
    private int h, m;


    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
        if (h > HOURSPERDAY - 1 || h < 0 || m > MINUTESPERDAY - 1 || m < 0)
            throw new IllegalArgumentException();
        this.h = h;
        this.m = m;
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        int colonIndex = s.indexOf(':');
        if (s.length() != 5 || colonIndex != 2) throw new IllegalArgumentException();
        h = Integer.parseInt(s.substring(0, colonIndex));
        m = Integer.parseInt(s.substring(colonIndex + 1));
        if (h > HOURSPERDAY - 1 || h < 0 || m > MINUTESPERDAY - 1 || m < 0)
            throw new IllegalArgumentException();
    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String sHour = Integer.toString(h);
        String sMinutes = Integer.toString(m);
        sHour = (sHour.length() == 1) ? "0" + sHour : sHour;
        sMinutes = (sMinutes.length() == 1) ? "0" + sMinutes : sMinutes;
        return sHour + ":" + sMinutes;
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        return (this.h < that.h) || (this.h == that.h && this.m < that.m);
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        this.h = (h + ((m + 1) / MINUTESPERDAY)) % HOURSPERDAY;
        this.m = (m + 1) % MINUTESPERDAY;
    }

    // Adds Δ minutes to the time on this clock.
    public void toc(int delta) {
        if (delta < 0) throw new IllegalArgumentException();
        this.h = (h + ((m + delta) / MINUTESPERDAY)) % HOURSPERDAY;
        this.m = (m + delta) % MINUTESPERDAY;
    }

    public static void main(String[] args) {
        Clock userTime = new Clock(23, 55);
        Clock otherTime = new Clock("08:45");
        StdOut.println(userTime.toString());
        userTime.tic();
        StdOut.println(userTime.toString());
        userTime.toc(15);
        StdOut.println(userTime.toString());
        StdOut.println(userTime.isEarlierThan(otherTime));
        StdOut.println(otherTime.toString());
        otherTime.toc(1441);
        StdOut.println(otherTime.toString());
    }
}
