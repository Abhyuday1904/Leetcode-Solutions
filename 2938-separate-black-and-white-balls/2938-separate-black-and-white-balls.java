class Solution {
    public long minimumSteps(String s) {
        long ans = 0;
        int len = s.length();
        int last1 = len-1;
        for(int i=len-1;i>=0;i--)
        {
            if(s.charAt(i) == '1')
            {
                ans = ans + last1-i;
                last1--;
            }
        }
        return ans;
    }
}