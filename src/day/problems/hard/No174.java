package day.problems.hard;

public class No174 {
    public int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length;
        int col = dungeon[0].length;
        int[][] dp = new int[row][col];
        dp[row - 1][col - 1] = dungeon[row - 1][col - 1] >= 0 ? 0 : -dungeon[row - 1][col - 1];
        for (int i = row - 2; i >= 0; i--) {
            dp[i][col - 1] = Math.max(dp[i + 1][col - 1] - dungeon[i][col - 1], 0);
        }
        for (int j = col - 2; j >= 0; j--) {
            dp[row - 1][j] = Math.max(dp[row - 1][j + 1] - dungeon[row - 1][j], 0);
        }

        for (int i = row - 2; i >= 0; i--) {
            for (int j = col - 2; j >= 0; j--) {
                int minTemp = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(minTemp - dungeon[i][j], 0);
            }
        }
//        for (int[] i : dp) {
//            for (int j : i) {
//                System.out.print(j);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        return dp[0][0] + 1;
    }

    public static void main(String[] args) {
        int[][] matrix = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        System.out.println(new No174().calculateMinimumHP(matrix));
    }
}
