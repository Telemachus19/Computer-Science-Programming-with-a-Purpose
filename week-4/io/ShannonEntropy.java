/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]), cnt = 0;
        int[] freq = new int[m + 1];
        double entropy = 0;
        // Getting the input from the file or the stream.
        while (!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            freq[i]++;
            cnt++;
        }
        // Calculating the shanon entropy
        for (int i = 1; i < m + 1; i++) {
            if (freq[i] != 0) {
                double p = (double) freq[i] / cnt;
                entropy += -p * (Math.log(p) / Math.log(2));
            }
        }
        StdOut.printf("%.4f\n", entropy);
    }
}
