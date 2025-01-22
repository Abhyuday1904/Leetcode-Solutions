class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length()][word2.length()];
        for(int rows[] : dp){
            Arrays.fill(rows , -1);
        }

        return solve(word1 , word2 , word1.length()-1 , word2.length()-1 , dp);        
    }
    public int solve(String s , String t , int i , int j , int dp[][]){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == t.charAt(j)) dp[i][j] =  solve(s,t , i -1 , j-1 ,dp);
        else{
            dp[i][j] =  1 + Math.min(solve(s, t, i-1,j-1,dp) , Math.min(
                solve(s,t,i-1,j,dp) , 
                solve(s,t,i , j-1,dp)
                )
                );
        }
        return dp[i][j];
    }
}