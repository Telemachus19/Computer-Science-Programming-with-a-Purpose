/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ActivationFunction {
    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        // if x is NaN
        if (Double.isNaN(x))
            return Double.NaN;
        // if x < 0 return 0
        if (x < 0)
            return 0;
        // if x = 0, returns 1/2
        if (x == 0)
            return 0.5;
        // gets executed if both of the above ifs are not.
        return 1.0;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x))
            return Double.NaN;
        return 1 / (1 + Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (Double.isNaN(x))
            return Double.NaN;
        if (x >= 20)
            return 1;
        if (x <= -20)
            return -1;
        return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (Double.isNaN(x))
            return Double.NaN;
        if (x == Double.POSITIVE_INFINITY)
            return 1;
        if (x == Double.NEGATIVE_INFINITY)
            return -1;
        return x / (1 + Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x))
            return Double.NaN;
        if (x <= -2)
            return -1;
        if (x < 0 && x > -2)
            return x + ((x * x) / 4);
        if (x >= 0 && x < 2)
            return x - ((x * x) / 4);
        return 1;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.println("heaviside(" + x + ")" + " = " + heaviside(x));
        StdOut.println("  sigmoid(" + x + ")" + " = " + sigmoid(x));
        StdOut.println("     tanh(" + x + ")" + " = " + tanh(x));
        StdOut.println(" softsign(" + x + ")" + " = " + softsign(x));
        StdOut.println("     sqnl(" + x + ")" + " = " + sqnl(x));
    }
}
