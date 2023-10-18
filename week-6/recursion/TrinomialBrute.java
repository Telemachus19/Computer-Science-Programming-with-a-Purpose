/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class TrinomialBrute {
    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k) {
        if (n == 0 && k == 0) return 1;
        if (k < -n || k > n) return 0;
        return trinomial(n - 1, k - 1) + trinomial(n - 1, k) + trinomial(n - 1, k + 1);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]), k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));
        // for (int i = 0; i < 6; i++) {
        //     for (int j = 0; j < 6; j++) {
        //         System.out.printf("T(%d,%d) = %d\n", i, j, trinomial(i, j));
        //     }
        // }
    }
}
