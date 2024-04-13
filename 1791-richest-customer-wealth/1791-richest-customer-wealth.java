class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int len = accounts.length;
        for(int i=0;i<len;i++)
        {   
            int len2 = accounts[i].length;
            int sum = 0;
            for(int j=0;j<len2;j++)
            {
                sum += accounts[i][j];
            }
            if(max<sum) max = sum;
        }
        return max;   
    }
}