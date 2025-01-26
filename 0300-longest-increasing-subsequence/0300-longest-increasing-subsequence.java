class Solution {
    public int lengthOfLIS(int[] arr) {
        int dp[][] = new int[arr.length][arr.length+1];
        for(int rows[] : dp) Arrays.fill(rows , -1);
        return solve(arr , 0 , -1 , dp);
    }
    public int solve(int arr[] , int ind , int prev_ind , int dp[][]){
        if(ind == arr.length) return 0;
        if(dp[ind][prev_ind+1] != -1) return dp[ind][prev_ind+1];
        int take = 0;
        int not_take = 0 + solve(arr , ind+1 , prev_ind , dp);
        if(prev_ind == -1 || arr[ind]>arr[prev_ind]){
             take = 1 + solve(arr , ind+1 , ind ,dp);
        } 
        dp[ind][prev_ind+1] = Math.max(take , not_take);
        return dp[ind][prev_ind+1];
    }
}