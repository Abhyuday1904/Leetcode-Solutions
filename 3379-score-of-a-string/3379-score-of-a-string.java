class Solution {
    public int scoreOfString(String s) {
        int len = s.length();
        int sum =0;
        for(int i=0;i<len-1;i++)
        {
            char ch  = s.charAt(i);
            char ch1 = s.charAt(i+1);
            sum += Math.abs((int)ch - (int)ch1);
        }
        return sum;
    }
}