/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Htree {
    public static void drawH(double x, double y, double size) {
        // computing the coordinates
        double x0 = x - size / 2;
        double x1 = x + size / 2;
        double y0 = y - size / 2;
        double y1 = y + size / 2;

        // drawing the H shape
        StdDraw.line(x0, y0, x0, y1); // left vertical line
        StdDraw.line(x1, y0, x1, y1); // right vertical line
        StdDraw.line(x0, y, x1, y); // Line connect two vertical lines

    }

    public static void hTree(int n, double x, double y, double size) {
        // base case where n = 0;
        if (n == 0) return;
        // draw the shape
        drawH(x, y, size);
        // computing the corners of the H shape
        double x0 = x - size / 2;
        double x1 = x + size / 2;
        double y0 = y - size / 2;
        double y1 = y + size / 2;

        // drawing four H shapes at the corners
        hTree(n - 1, x0, y0, size / 2); // lower left corner
        hTree(n - 1, x0, y1, size / 2); // upper left corner
        hTree(n - 1, x1, y0, size / 2); // lower right corner
        hTree(n - 1, x1, y1, size / 2); // upper right corner

    }

    public static void main(String[] args) {
        // StdDraw.setScale(-10, 10);
        // StdDraw.line(-10, 0, 10, 0);
        // StdDraw.line(0, 10, 0, -10);
        int n = Integer.parseInt(args[0]);
        StdDraw.enableDoubleBuffering();
        hTree(n, 0.5, 0.5, 0.5);
        StdDraw.show();
    }
}
