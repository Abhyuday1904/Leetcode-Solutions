class Solution {
    public int maximizeGreatness(int[] arr) {
        int ans =0;
        Arrays.sort(arr);
        for(int i=0,j=1;j<arr.length;)
        {
            if(arr[i]<arr[j]) 
            {
                i++;
                j++;
                ans++;
            }
            else j++;
        }
        return ans;
    }
}