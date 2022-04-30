/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] sum = new int[args.length];
        int length = sum.length;
        for (int i = 1; i < length; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(args[i]);
        }
        // for (int i = 0; i < length; i++) {
        //     System.out.print(sum[i] + " ");
        // }
        for (int i = 0; i < m; i++) {
            double rand = sum[length - 1] * Math.random();
            int randi = (int) rand;
            for (int j = 0; j < length; j++) {
                if (randi >= sum[j] && randi < sum[j + 1]) {
                    System.out.print(j + 1 + " ");
                    break;
                }
            }
        }
    }
}
