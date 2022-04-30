/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]), n = Integer.parseInt(args[1]), k = Integer
                .parseInt(args[2]);
        boolean[][] hasMine = new boolean[m + 2][n + 2];
        int[][] cnt = new int[m + 2][n + 2];
        int mineCnt = 0;
        while (mineCnt < k) {
            int randI = 1 + (int) (Math.random() * (m));
            int randJ = 1 + (int) (Math.random() * (n));
            if (!hasMine[randI][randJ]) {
                hasMine[randI][randJ] = true;
                mineCnt++;
                for (int i = randI - 1; i < randI + 2; i++) {
                    for (int j = randJ - 1; j < randJ + 2; j++) {
                        cnt[i][j]++;
                    }
                }
            }
        }
        // for (int i = 0; i < m + 2; i++) {
        //     for (int j = 0; j < n + 2; j++) {
        //         if (hasMine[i][j])
        //             System.out.print("*  ");
        //         else
        //             System.out.print("-  ");
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (hasMine[i][j])
                    System.out.print("*  ");
                else
                    System.out.print(cnt[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
