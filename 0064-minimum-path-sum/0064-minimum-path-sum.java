class Solution {
    public int minPathSum(int[][] obs) {
        int m = obs.length;
        int n = obs[0].length;
        int[][] dp = new int[m][n];

        dp[0][0] = obs[0][0];

        // Fill first row
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + obs[0][j];
        }

        // Fill first column
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + obs[i][0];
        }

        // Fill the rest of the dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = obs[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m - 1][n - 1];
    }
}
