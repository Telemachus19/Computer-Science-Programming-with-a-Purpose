/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Triangle {
    public static void main(String[] args) {
        double c = Math.sqrt(3.0) * 0.5;
        StdDraw.setPenRadius(0.01);
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.5, c);
        StdDraw.line(0.5, c, 0.0, 0.0);
        StdDraw.point(0.5, c / 3.0);
        StdDraw.text(0.5, 0.5, "Hello, World!");

    }
}
