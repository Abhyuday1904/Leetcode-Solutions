class Solution {
    public int lastStoneWeightII(int[] arr) {
        int sum  = 0;
        for(int i = 0 ; i<arr.length;i++){
            sum += arr[i];
        }
        
        for(int i = sum/2 ; i >= 0 ; i--){
            int dp[][] = new int[arr.length][i+1];
            for(int rows[] : dp) Arrays.fill(rows , -1);
            if(solve(arr.length - 1 , i , arr , dp)){
                return Math.abs((sum - i) - i);
            }
        }
        return 0;
    }
    public boolean  solve(int ind , int target , int arr[] , int dp[][]){
        if(target == 0 )return true;
        if(ind == 0 ){
            if(arr[0] == target) return true;
            else return false;
        }
        if(dp[ind][target] != -1) return dp[ind][target] == 1;
        boolean  not_take = solve(ind-1  , target , arr , dp);
        boolean take = false ;
        if(target >= arr[ind]){
            take = solve(ind-1 , target - arr[ind] , arr ,dp);
        }
        dp[ind][target] = (take || not_take) ? 1 :0;
        return dp[ind][target] == 1;
    }
}