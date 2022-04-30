public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
        double distance;
        double radiusEarth = 6371.0;
        double meanX = (x2 - x1) / 2;
        double meanY = (y2 - y1) / 2;
        double a = Math.sin(meanX) * Math.sin(meanX);
        double b = Math.cos(x1) * Math.cos(x2) * Math.sin(meanY) * Math.sin(meanY);
        double c = Math.sqrt(a + b);
        distance = 2 * radiusEarth * Math.asin(c);
        System.out.println(distance + " kilometers");
    }
}
