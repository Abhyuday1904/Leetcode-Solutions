class Solution {
    public int passThePillow(int n, int t) {
        int ans;
        int q = t / (n-1);
        int rem = t % (n-1);
        
        if(q % 2 == 0) ans = 1 + rem;
        else ans = n - rem; 
        return ans;
    }
}