/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RevesPuzzle {
    private static void hanoi(int n, int k, String start, String t, String end) {
        if (n == 0) return;
        hanoi(n - 1, k, start, end, t);
        StdOut.printf("Move disc %d from %s to %s\n", (n + k), start, end);
        hanoi(n - 1, k, t, start, end);

    }

    private static void reves(int n, String start, String t1, String t2, String end) {
        int k = (int) Math.round(n + 1 - Math.sqrt(2 * n + 1));
        if (k == 0) {
            StdOut.printf("Move disc 1 from %s to %s\n", start, end);
            return;
        }
        reves(k, start, end, t2, t1);
        hanoi(n - k, k, start, t2, end);
        reves(k, t1, start, t2, end);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // StdOut.printf("Hello World!\n");
        // reves(n, 'A', 'B', 'C', 'D');
        // StdOut.printf("Hanoi!\n");
        // hanoi(n, 0, 'A', 'B', 'C');
        // StdOut.printf("Reves!\n");
        reves(n, "A", "B", "C", "D");
    }
}
