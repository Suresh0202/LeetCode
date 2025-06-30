class Solution {
    public int findTargetSumWays(int[] nums, int target2) {
        int sum = 0;
        for (int i : nums) sum += i;

        if ((sum + target2) % 2 != 0 || target2 > sum || target2 < -sum) return 0;

        int tar = (sum + target2) / 2;
        int[][] dp = new int[nums.length][tar + 1];

        // Base case: sum 0 is possible in 1 way (pick nothing)
        dp[0][0] = (nums[0] == 0) ? 2 : 1;  // IMPORTANT FIX

        if (nums[0] != 0 && nums[0] <= tar) dp[0][nums[0]] = 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= tar; j++) {
                int np = dp[i - 1][j];
                int p = (j >= nums[i]) ? dp[i - 1][j - nums[i]] : 0;
                dp[i][j] = p + np;
            }
        }

        return dp[nums.length - 1][tar];
    }
}
