class Solution {
    public long minOperationsToMakeMedianK(int[] arr, int k) {
        long ans =0;
        Arrays.sort(arr);
        int len = arr.length;
        
        
            int mid = len/2;
            ans = ans + Math.abs(k-arr[mid]);
            
            for(int j = mid-1;j>=0;j--)
            {
                if(arr[j]>k)
                {
                    ans = ans + (Math.abs(k-arr[j]));
                }
            }
            for(int j=mid+1;j<len;j++)
            {
                if(arr[j]<k)
                {
                    ans = ans + (Math.abs(k-arr[j]));
                }
            }
        return ans;
    }
}