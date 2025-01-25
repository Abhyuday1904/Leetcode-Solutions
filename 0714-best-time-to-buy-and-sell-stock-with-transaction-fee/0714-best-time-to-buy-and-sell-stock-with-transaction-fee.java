class Solution {
    public int maxProfit(int[] arr, int fee) {
        int dp[][] = new int[arr.length][2];
        for(int rows[] : dp) Arrays.fill(rows , -1);

        return solve(arr , 0 , 0 , dp  ,fee);   
    }
    public int solve(int arr[]  , int ind, int buy , int dp[][], int fee){
        if(ind == arr.length) return 0;
        int p1;
        int p2;
        if(dp[ind][buy] != -1) return dp[ind][buy];
        if(buy==0){
            p1 =  solve(arr , ind+1 , 0 , dp ,fee);
            p2 = -arr[ind] + solve(arr , ind + 1 , 1 , dp , fee);
        }
        else{
            p1 = 0 + solve(arr , ind+1 , 1 ,dp , fee);
            p2 = arr[ind] - fee + solve(arr , ind+1 , 0 , dp , fee) ;
        }
        dp[ind][buy] =  Math.max(p1,p2);
        return dp[ind][buy];
    }
}