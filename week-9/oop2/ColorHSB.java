/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ColorHSB {
    private static final int MAXHUE = 359, MAXSB = 100;
    private final int h, s, b;

    public ColorHSB(int h, int s, int b) {
        if (h > MAXHUE || h < 0 || s > MAXSB || s < 0 || b > MAXSB || b < 0)
            throw new IllegalArgumentException();
        this.h = h;
        this.s = s;
        this.b = b;
    }

    public boolean isGrayscale() {
        return (s == 0 || b == 0);
    }

    public int distanceSquaredTo(ColorHSB that) {
        if (that == null) throw new IllegalArgumentException();
        return Math.min((h - that.h) * (h - that.h),
                        (360 - Math.abs(h - that.h)) * (360 - Math.abs(h - that.h)))
                + ((s - that.s) * (s - that.s)) + ((b - that.b) * (b - that.b));
    }

    public String toString() {
        return "(" + this.h + ", " + this.s + ", " + this.b + ")";
    }

    public static void main(String[] args) {
        int h = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        ColorHSB basic = new ColorHSB(h, s, b);
        String name, min = StdIn.readString();
        h = StdIn.readInt();
        s = StdIn.readInt();
        b = StdIn.readInt();
        ColorHSB minColor = new ColorHSB(h, s, b);
        ColorHSB mainColor;
        while (!StdIn.isEmpty()) {
            name = StdIn.readString();
            h = StdIn.readInt();
            s = StdIn.readInt();
            b = StdIn.readInt();
            mainColor = new ColorHSB(h, s, b);
            if (basic.distanceSquaredTo(mainColor) < basic.distanceSquaredTo(minColor)) {
                min = name;
                minColor = mainColor;
            }
        }
        System.out.println(min + " " + minColor);
    }
}
