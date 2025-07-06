class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[] zeros = new int[len];
        int[] ones = new int[len];
        for (int i = 0; i < len; i++) {
            int[] curr = check(strs[i]);
            zeros[i] = curr[0];
            ones[i] = curr[1];
        }

        dp = new int[len][m + 1][n + 1];
        for (int[][] twoD : dp)
            for (int[] oneD : twoD)
                Arrays.fill(oneD, -1);

        return solve(zeros, ones, m, n, 0);
    }

    public int solve(int[] zeros, int[] ones, int m, int n, int idx) {
        if (idx == zeros.length) return 0;
        if (dp[idx][m][n] != -1) return dp[idx][m][n];

        int take = 0;
        if (m >= zeros[idx] && n >= ones[idx]) {
            take = 1 + solve(zeros, ones, m - zeros[idx], n - ones[idx], idx + 1);
        }

        int not_take = solve(zeros, ones, m, n, idx + 1);
        return dp[idx][m][n] = Math.max(take, not_take);
    }

    public int[] check(String s) {
        int[] ans = new int[2];
        for (char c : s.toCharArray()) {
            if (c == '0') ans[0]++;
            else ans[1]++;
        }
        return ans;
    }
}
