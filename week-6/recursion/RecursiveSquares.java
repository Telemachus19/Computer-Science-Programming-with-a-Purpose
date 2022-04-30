/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import java.awt.Color;

public class RecursiveSquares {
    public static void drawSquare(double x, double y, double length) {
        // determining the r value
        StdDraw.setPenColor(Color.lightGray);
        StdDraw.filledSquare(x, y, length / 2);
        StdDraw.setPenColor(Color.black);
        StdDraw.square(x, y, length / 2);

    }

    public static void draw(int n, double x, double y, double length) {
        if (n == 0) return;


        // determining the four corners of the square
        double x0 = x - length / 2;
        double x1 = x + length / 2;
        double y0 = y - length / 2;
        double y1 = y + length / 2;

        // drawing the four squares at each corner
        draw(n - 1, x0, y1, length / 2); // upper left corner
        draw(n - 1, x1, y1, length / 2); // upper right corner
        drawSquare(x, y, length);
        draw(n - 1, x1, y0, length / 2); // lower right corner
        draw(n - 1, x0, y0, length / 2); // lower left corner

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        draw(n, 0.5, 0.5, 0.5);
    }
}
