class Solution {
    public int longestPalindromeSubseq(String s) {
        if(s.length() == 1 ) return 1;
        StringBuilder ss = new StringBuilder(s);
        return longestCommonSubsequence(s , ss.reverse().toString());
    }

    public int longestCommonSubsequence(String s, String t) {
        int dp[][] = new int[s.length()+1][t.length()+1];
        for(int i =0 ;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
         for(int i =0 ;i<dp.length;i++ ) dp[i][0] = 0;
       for(int j =0 ;j<dp[0].length;j++) dp[0][j] = 0;

       for(int i = 1;i<dp.length;i++){
        for(int j = 1;j<dp[0].length;j++){

            if(s.charAt(i-1) == t.charAt(j-1)){
                dp[i][j] = 1 + dp[i-1][j-1];
            }
            else{
               dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
       }
       return dp[s.length()][t.length()];
    }
}