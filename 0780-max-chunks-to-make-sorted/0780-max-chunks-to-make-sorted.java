class Solution {
    public int maxChunksToSorted(int[] arr) {
         int n = arr.length;
       int max[] = new int[n];
       max[0] = arr[0];
        int m = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i]> m) m = arr[i];
            max[i] = m;
        }
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            if(max[i] == i) ans++;
        }
        return ans;
    }
}