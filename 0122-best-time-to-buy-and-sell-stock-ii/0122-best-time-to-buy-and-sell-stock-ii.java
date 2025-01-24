class Solution {
    public int maxProfit(int[] arr) {
        int dp[][] = new int[arr.length][2];
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }
        return solve(arr , 0 , 0 , dp);
    }
    public int solve(int arr[] , int i , int buy , int dp[][]){
        if(i == arr.length) return 0;
        int p1;
        int p2;
        if(dp[i][buy] != -1) return dp[i][buy];
        if(buy == 0){
            p1 = 0 + solve(arr , i+1 , 0 , dp );
            p2 = -arr[i] + solve(arr , i+1 , 1 , dp);
        }
        else{
            p1 = 0 + solve(arr , i+1 , 1 , dp);
            p2 = arr[i] + solve(arr , i+1 , 0 , dp);
        }
        dp[i][buy] =  Math.max(p1, p2);
        return dp[i][buy];
    }

}