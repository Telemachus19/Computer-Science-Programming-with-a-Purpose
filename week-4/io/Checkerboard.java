/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import java.awt.Color;

public class Checkerboard {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 != 0) StdDraw.setPenColor(Color.lightGray);
                else StdDraw.setPenColor(Color.blue);
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
        StdDraw.show();
    }
}
