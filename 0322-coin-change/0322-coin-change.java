class Solution {
    public int coinChange(int[] arr, int amount) {
        if(amount  == 0) return 0;
        int ans = minn(arr , amount);
        if(ans != (int)1e9) return ans;
        return -1;
    }
    public static int minn(int arr[] , int target ){
        int dp[][] = new int[arr.length+1][target + 1 ];
        for(int i = 0 ; i<dp.length;i++){
            for(int j =0 ;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return solve(arr , target , arr.length-1 , dp);
    }
    public static int solve(int arr[] , int target, int ind , int dp[][]){
        if(target ==0 ) return 0;
        if(ind == 0) {
            if(target%arr[0] == 0) return target/arr[0];
            else return (int)1e9;
        }
        if(dp[ind][target] != -1 ) return dp[ind][target];
        int not_pick  = solve(arr , target , ind-1 , dp);
        int pick =(int)1e9;
        if(arr[ind] <=  target)
        {
            pick = 1 + solve(arr , target - arr[ind] , ind , dp);
        }
        dp[ind][target] = Math.min(pick , not_pick);
        return dp[ind][target];
    }
}