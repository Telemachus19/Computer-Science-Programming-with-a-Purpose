/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]), trials = Integer.parseInt(args[1]), person = 0;
        int[] count = new int[days + 2];
        double fraction = 0.0;

        // Performing the experiment trials time
        for (int t = 0; t < trials; t++, person = 0) {
            // Experiment
            boolean[] hasBirthday = new boolean[days];
            while (true) {
                // Choose a birthday
                int d = (int) (Math.random() * days);
                // If that person shares a birthday with someone else in the room, stop; otherwise repeat.
                if (hasBirthday[d]) {
                    count[person]++;
                    break;
                }
                // Record the birthday and enter the person count
                hasBirthday[d] = true;
                person++;
            }
        }

        // Printing the summary
        for (int i = 0; fraction < 0.5; i++) {
            fraction += (double) count[i] / trials;
            System.out.println((i + 1) + "\t" + count[i] + "\t" + fraction);
        }
    }
}
