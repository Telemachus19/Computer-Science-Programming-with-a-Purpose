public class CMYKtoRGB {
    public static void main(String[] args) {
        /*double cyan, magenta, yellow, black, white, red, green, blue;
        cyan = Double.parseDouble(args[0]);
        magenta = Double.parseDouble(args[1]);
        yellow = Double.parseDouble(args[2]);
        black = Double.parseDouble(args[3]);
        white = 1 - black;
        red = 255 * white * (1 - cyan);
        green = 255 * white * (1 - magenta);
        blue = 255 * white * (1 - yellow);
        System.out.printf("red   = %.0f\ngreen = %.0f\nblue  = %.0f", red, green, blue);*/
        int n = 123456789;
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println(m);
        int i, j;
        for (i = 0, j = 0; i < 10; i++)
            j += i;
        System.out.println(j);

    }
}
