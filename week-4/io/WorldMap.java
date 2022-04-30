/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class WorldMap {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        // StdOut.println(width + " " + height);
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        while (!StdIn.isEmpty()) {
            StdIn.readString();
            // StdOut.println(name);
            int vertices = StdIn.readInt();
            int i = 0;
            double[] x = new double[vertices];
            double[] y = new double[vertices];
            while (i < vertices) {
                x[i] = StdIn.readDouble();
                // StdOut.printf("%f ", x[i]);
                y[i] = StdIn.readDouble();
                // StdOut.printf("%f\n", y[i]);
                i++;
            }
            StdDraw.polygon(x, y);
        }
        StdDraw.show();
    }
}
