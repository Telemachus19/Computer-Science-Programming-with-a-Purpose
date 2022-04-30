/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int[] thue = new int[size];
        thue[0] = 0;
        for (int i = 1; i < size; i++) {
            if (i % 2 == 0) {
                thue[i] = thue[i / 2];
            }
            else {
                thue[i] = (1 - thue[i - 1]);
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (thue[i] == thue[j]) {
                    System.out.print("+  ");
                }
                else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
