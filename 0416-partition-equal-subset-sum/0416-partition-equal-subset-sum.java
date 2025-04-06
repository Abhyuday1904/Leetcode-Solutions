class Solution {
    public boolean canPartition(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) sum+=arr[i];
        if(sum%2!=0) return false;
        int target = sum/2;
        boolean dp[][] = new boolean[arr.length][target + 1 ];
        for(boolean rows[] : dp){
            Arrays.fill(rows , false);
        }
        for(int i = 0;i<dp.length;i++){
            dp[i][0] = true;
        }
        if(arr[0]<=target){
            dp[0][arr[0]] = true; 
        }
        for(int i =1 ; i<dp.length;i++){
            for(int j = 1 ; j<dp[0].length;j++){
                if(arr[i]<= j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j - arr[i]];
                    
                }
                else {
                    dp[i][j] = false || dp[i-1][j];
                }
                
            }
        }
        return dp[arr.length-1][target];

    }
}