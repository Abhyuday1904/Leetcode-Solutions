class Solution {
    public int countKDifference(int[] arr, int k) {
        int len =  arr.length;
        int ans =0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(Math.abs((arr[i]-arr[j])) == k) ans++;
            }   
        }
        return ans;
    }
}