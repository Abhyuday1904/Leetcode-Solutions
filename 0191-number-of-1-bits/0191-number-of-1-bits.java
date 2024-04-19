class Solution {
    public int hammingWeight(int n) {
        if (n == 0) {
            return 0;
        }
        int ans =0;
        while (n > 0) {
            int remainder = n % 2;
            if(remainder == 1) ans++;
            n = n / 2;
        }
        return ans;
    }
}