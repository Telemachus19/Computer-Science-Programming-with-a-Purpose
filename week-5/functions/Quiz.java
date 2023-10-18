/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Quiz {
    public static void Q3(int n) {
        if (n <= 0) return;
        StdOut.println(n);
        Q3(n - 2);
        Q3(n - 3);
        StdOut.println(n);
    }

    public static int Q5(int n) {
        int[] b = new int[n + 1];
        b[0] = 1;
        for (int i = 2; i <= n; i++) {
            b[i] = 0;
            for (int j = 0; j < i; j++)
                b[i] += b[j];
        }
        return b[n];
    }

    public static void main(String[] args) {
        Q3(7);
        /*int b = Q5(8);
        StdOut.println(b);*/
    }
}
