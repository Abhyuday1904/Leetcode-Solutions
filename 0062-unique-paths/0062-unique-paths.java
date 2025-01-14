class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i =0 ;i<dp.length;i++){
            for(int j = 0 ;j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return solve(m-1 , n-1 , dp);
    }
   
    public static int solve(int m  , int n , int dp[][]){

        if(m == 0 && n == 0){
            return 1;
        }
        if(dp[m][n] != -1) return dp[m][n];
        int bottom  = 0;
        int right  = 0;
        if(m>0){
             bottom  = solve(m - 1 , n , dp);
        }
        if(n>0){
             right = solve(m , n-1 ,dp);
        }
        dp[m][n] = bottom  + right;
        return dp[m][n];
    }
}