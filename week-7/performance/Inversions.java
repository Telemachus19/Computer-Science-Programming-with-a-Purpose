/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Inversions {

    public static long count(int[] a) {
        long cnt = 0;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = (i + 1); j < len; j++) {
                if (a[i] > a[j])
                    cnt++;
            }
        }
        return cnt;
    }

    public static int[] generate(int n, long k) {
        if (k < 0) throw new IllegalArgumentException("K is less than 0\n");
        int[] a = new int[n];
        int j = 1;
        int i = 0;
        int endIndex = n - 1;
        while (j <= n) {
            if (k >= (n - j)) {
                a[i] = n - j;
                k -= (n - j);
                i++;
            }
            else {
                a[endIndex] = n - j;
                endIndex--;
            }
            j++;
        }
        return a;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        int[] a = generate(n, k);
        for (int i = 0; i < n; i++) {
            StdOut.print(a[i] + " ");
        }
    }
}
