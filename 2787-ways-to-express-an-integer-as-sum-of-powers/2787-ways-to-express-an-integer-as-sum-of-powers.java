class Solution {
    int MOD = (int)1e9+7;
    public int numberOfWays(int n, int x) {
        
        int dp[][] = new int[n+2][n+1];
        for(int a[] : dp) Arrays.fill(a,-1);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int base = 1;base<=n; base++) {
            int pow=(int)Math.pow(base,x);
            if(pow>n)
            break;
            arr.add( pow);
        }
        return solve(arr , n , x , 0 , 0 , dp);
    }
    public int solve(ArrayList<Integer> arr, int n , int x, int idx , int sum , int dp[][]){
        if(idx>=arr.size()) {
            if(sum == n) return 1;
            else return 0;
        }
        if(dp[idx][sum]!=-1) return dp[idx][sum];
        int take = 0;
        sum = (sum + arr.get(idx))%MOD;
        if(sum <= n ){
            take = solve(arr , n , x , idx+1,sum,dp);
        }
        
        int not_take = 0;
        sum =  (sum - arr.get(idx))%MOD; 
        not_take = solve(arr , n , x , idx+1 , sum,dp);
        return dp[idx][sum] = (take + not_take)%MOD;

    }
}