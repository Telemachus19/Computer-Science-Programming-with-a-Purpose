public class RightTriangle {
    public static void main(String[] args) {
        int long a = Long.parseLong(args[0]);
        int long b = Long.parseLong(args[1]);
        int c = Long.parseLong(args[2]);
        boolean isPositive = (a > 0) && (b > 0) && (c > 0);
        boolean isRightAngle = (a * a + b * b == c * c) || (a * a + c * c == b * b) || (
                b * b + c * c == a * a);
        System.out.println(isPositive && isRightAngle);
    }
}
