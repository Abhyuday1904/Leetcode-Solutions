class Solution {
    public int rob(int[] arr) {
        int dp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++ ) dp[i] = -1;
        return solve(arr, arr.length-1 ,  dp);
        
    }
    public int solve(int arr[] , int ind , int dp[]){
        if(ind == 0 ){
            return arr[0];
        }
        if(ind < 0){
            return 0;
        }
        if(dp[ind]!= -1) return dp[ind];
        int pick = solve(arr , ind -2 , dp ) + arr[ind];
        int not_pick = solve(arr, ind-1 , dp);
        dp[ind]  = Math.max(pick , not_pick);
        return dp[ind] ;
    }
}